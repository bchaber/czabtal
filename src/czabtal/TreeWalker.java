package czabtal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.tree.*;

public class TreeWalker {
	public static int lineNumber = 1;
	private static ExecutionContext mainContext;
	private static List<GatedefData> stack = new ArrayList<GatedefData>();
	
	public static void start(CommonTree tree) {
		mainContext = new ExecutionContext();
		for(Object o : tree.getChildren()) {
			if(o == null)
				continue;
			CommonTree child = (CommonTree)o;
			switch(child.getToken().getType()) {
				case czabtalParser.NL:
					lineNumber += 1;
					break;
				default:
					polecenie(child, mainContext);
					break;
			}
		}
	}

	private static void polecenie(CommonTree tree, ExecutionContext incomingContext) {
		ExecutionContext context = incomingContext;
		// 
		switch (tree.getToken().getType()) {
		case czabtalParser.DEF:
			def(tree, context);
			break;
		case czabtalParser.DEKL:
			dekl(tree, context);
			break;
		case czabtalParser.IFR:
			ifr(tree, context);
			break;
		case czabtalParser.PRINTR:
			printr(tree, context);
			break;
		case czabtalParser.PRZYP:
			przyp(tree, context);
			break;
		case czabtalParser.NEWLINE:
			newLine(tree);
			break;
		case czabtalParser.FORARGS:
			forargs(tree, context);
			break;
		case czabtalParser.RETURNR:
			returnr(tree, context);
			break;
		default:
			throw new SemanticException("Unable to handle command.", lineNumber);
		}
	}

	private static void def(CommonTree tree, ExecutionContext incomingContext) {
		CommonTree ident = (CommonTree) tree.getChild(0);
		CommonTree args = (CommonTree) tree.getChild(1);
		CommonTree nl1 = (CommonTree) tree.getChild(2);
		CommonTree nl2 = (CommonTree) tree.getChild(3);
		CommonTree polecenia = (CommonTree) tree.getChild(4);
		CommonTree end = (CommonTree) tree.getChild(5);
		newLine(nl1); newLine(nl2);
		String name = ident.getToken().getText();
		EntryList arguments = new EntryList();
		Boolean isArgs = getArguments(args, arguments);
		GatedefData gd = new GatedefData();
		gd.setArgs(isArgs);
		if(isArgs)
			gd.setNumberOfParams(arguments.size()-1);
		else
			gd.setNumberOfParams(arguments.size());
		gd.setPtr(polecenia);
		gd.setArguments(arguments);
		gd.setName(name);
		incomingContext.addVariable(name, Types.GATEDEF, gd);
		lineNumber = end.getToken().getLine();
	}
	
	private static Boolean getArguments(CommonTree args, EntryList arguments) {
		Boolean isArgs = false;
		for(Object o : args.getChildren()) {
			if(o == null)
				continue;
			CommonTree t = (CommonTree)o;
			switch(t.getToken().getType()) {
				case  czabtalParser.IDENT:
					String name = t.getToken().getText();
					EntryList found = arguments.findAll(name);
					if(found.size() > 0)
						throw new SemanticException("Argument " + name + " defined more than once.", lineNumber);
					arguments.add(new EntryData(name, Types.LOGICAL, null));
					break;
				case czabtalParser.ARGS:
					isArgs = true;
					arguments.add(new EntryData("args", Types.ARGS, null));
					break;
				default:
					throw new SemanticException("Unrecognized function argument.", lineNumber);
			}
		}
		return isArgs;
	}

	private static void dekl(CommonTree tree, ExecutionContext incomingContext) {
		List<?> children = tree.getChildren();
		CommonTree dekltype = (CommonTree) children.get(0);
		CommonTree deklname = (CommonTree) children.get(1);
		CommonTree deklvalue = children.size() < 3 ? null : (CommonTree) children.get(2);
		switch(dekltype.getToken().getType()) {
			case czabtalParser.LOGICAL:
			{
				String name = deklname.getToken().getText();
				Types type = Types.LOGICAL;
				Boolean value = false;
				if(deklvalue != null)
					value = typ_logiczny(deklvalue.getChildren(), incomingContext);//zwroci typ logiczny
				incomingContext.addVariable(name, type, value);
				break;
			}
			case czabtalParser.GATE:
			{
				String name = deklname.getToken().getText();
				Types type = Types.GATE;
				Object data = null;
				if(deklvalue != null) {
					String id = deklvalue.getToken().getText();
					correctGateType(id, incomingContext);
					data = id;
				}
				incomingContext.addVariable(name, type, data);
				break;
			}
			default:
				throw new SemanticException("Unrecognized variable's type.", lineNumber);
		}
	}
	
	private static void ifr(CommonTree tree, ExecutionContext incomingContext) {
		lineNumber = tree.getLine();
		CommonTree first = (CommonTree)tree.getChild(0);
		Boolean b = wyr_warun(first.getChildren(), incomingContext);
		for(int i = 1; i < tree.getChildCount(); i++) {
			CommonTree t = (CommonTree) tree.getChild(i);
			if(t == null) continue;
			switch(t.getToken().getType()) {
			case czabtalParser.POLECENIA_FUN:
				if(b){
					ExecutionContext newContext = new ExecutionContext(incomingContext); 
					polecenia_fun(t, newContext);
					Boolean returnValue = newContext.getReturnValue();
					if(returnValue != null)
						incomingContext.setReturnValue(returnValue);
				}
				break;
			case czabtalParser.ELSER:
				if(!b) elser(t, incomingContext);
				break;
			case czabtalParser.NEWLINE:
				newLine(t);
				break;
			default:
				throw new SemanticException("Unable to handle command in if.", lineNumber);
			}
		}
	}
	
	private static void elser(CommonTree tree, ExecutionContext incomingContext) {
		CommonTree first = (CommonTree)tree.getChild(0);
		if(first.getToken().getType() == czabtalParser.WYR_WARUN) {
			ifr(tree, incomingContext);
			return;			
		}
		lineNumber = tree.getLine();
		for(Object o : tree.getChildren()) {
			CommonTree t = (CommonTree) o;
			if(t == null) continue;
			switch(t.getToken().getType()) {
			case czabtalParser.POLECENIA_FUN:
				ExecutionContext newContext = new ExecutionContext(incomingContext);
				polecenia_fun(t, newContext);
				Boolean returnValue = newContext.getReturnValue();
				if(returnValue != null)
					incomingContext.setReturnValue(returnValue);
				break;
			case czabtalParser.NEWLINE:
				newLine(t);
				break;
			default:
				throw new SemanticException("Unable to handle command in else.", lineNumber);
			}
		}
	}

	private static void polecenia_fun(CommonTree tree,
			ExecutionContext incomingContext) {
		
			for(Object o : tree.getChildren()) {
				if(o == null)
					continue;
				CommonTree t = (CommonTree) o; 
				polecenie(t, incomingContext);
				if(incomingContext.getReturnValue() != null)
					break;
			}
			newLine((CommonTree)tree.getChild(1));
	}

	private static void printr(CommonTree tree, ExecutionContext incomingContext) {
		CommonTree typlogiczny = (CommonTree) tree.getChild(0);
		CommonTree first = (CommonTree) typlogiczny.getChild(0);
		switch(first.getToken().getType()) {
			case czabtalParser.IDENT: {
				String name = first.getToken().getText();
				correctGateType(name, incomingContext);
				Boolean b = typ_logiczny(typlogiczny.getChildren(), incomingContext);
				System.out.println(name + " -> " + b);				
				break;
			}
			case czabtalParser.WYR_WARUN: {
				if(first.getChildCount() == 1) {
					CommonTree wyrwarun = (CommonTree) first.getChild(0);
					if(wyrwarun.getToken().getType() == czabtalParser.IDENT) {
						String name = wyrwarun.getToken().getText();
						correctLogicalType(name, incomingContext);
						EntryData data = incomingContext.getVariable(name);
						Boolean b = (Boolean) data.getData();
						System.out.println(name + " = " + b);
					} else {
						Boolean b = wyr_warun(first.getChildren(), incomingContext);
						System.out.println(b);
					}
				} else {
					Boolean b = wyr_warun(first.getChildren(), incomingContext);
					System.out.println(b);
				}
				break;
			}
			default:
				throw new SemanticException("Cannot print given argument.", lineNumber);
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void forargs(CommonTree tree, ExecutionContext incomingContext) {
		CommonTree ident = (CommonTree) tree.getChild(0);
		CommonTree nl1 = (CommonTree) tree.getChild(1);
		CommonTree nl2 = (CommonTree) tree.getChild(2);
		CommonTree polecenia = (CommonTree) tree.getChild(3);
		newLine(nl1); newLine(nl2);
		String name = ident.getToken().getText(); // nazwa nowego parametru; forargs l
		EntryData args = incomingContext.getParams().find("args");
		if(args == null)
			throw new SemanticException("Forargs used, but no args found in function definition.", lineNumber);
			
		if(incomingContext.getParams().find(name) != null)
			throw new SemanticException("Parameter " + name + " used more than once.", lineNumber);

		List<Boolean> argsList = (List<Boolean>) args.getData();
		for(Boolean arg : argsList) {
			ExecutionContext newContext = new ExecutionContext(incomingContext);
			newContext.getParams().add(new EntryData(name, Types.LOGICAL, arg));
			lineNumber = polecenia.getLine();
			polecenia_fun(polecenia, newContext);
			Boolean returnValue = newContext.getReturnValue();
			if(returnValue != null) {
				incomingContext.setReturnValue(returnValue);
				break;
			}
		}
	}

	private static void returnr(CommonTree tree, ExecutionContext context) {
		CommonTree logic = (CommonTree) tree.getChild(0);
		if(logic.getToken().getType() != czabtalParser.TYP_LOGICZNY)
			throw new SemanticException("Return value is not logical type.", lineNumber);
		Boolean returnValue = typ_logiczny(logic.getChildren(), context);
		context.setReturnValue(returnValue);
	}
	
	private static void przyp(CommonTree tree, ExecutionContext incomingContext) {
		CommonTree ident = (CommonTree) tree.getChild(0);
		CommonTree value = (CommonTree) tree.getChild(1);
		String name = ident.getToken().getText();
		correctLogicalType(name, incomingContext);
		Boolean b = typ_logiczny(value.getChildren(), incomingContext);
		incomingContext.setVariable(name, b);
	}

	private static Boolean typ_logiczny(List<?> list, ExecutionContext incomingContext) {
		CommonTree first = (CommonTree) list.get(0);
		switch(first.getToken().getType()) {
		case czabtalParser.WYR_WARUN:
			return wyr_warun(first.getChildren(), incomingContext);
		case czabtalParser.IDENT:
			String name = first.getToken().getText();
			correctGateType(name, incomingContext);
			CommonTree second = (CommonTree) list.get(1);
			List<String> idki = new LinkedList<String>();
			for(Object o : second.getChildren()) {
				if(o == null)
					continue;
				CommonTree t = (CommonTree)o;
				idki.add(t.getToken().getText());
			}
			GatedefData func = findGatedefData(name, idki.size(), mainContext);
			Boolean returnValue = executeFunction(func, idki, incomingContext); // wywolanie funkcji o nazwie ident
			lineNumber = first.getLine();
			return returnValue;
		}
		return null;
	}

	private static Boolean wyr_warun(List<?> children, ExecutionContext incomingContext) {
		Boolean left = false;
		Boolean right = null;
		Boolean foundIs = false;
		Boolean negate = false;
		
		int operation = -1;
		Boolean b = null;
		
		for(Object o : children) {
			if(o == null)
				continue;
			CommonTree t = (CommonTree) o;
				switch(t.getToken().getType()) {
				case czabtalParser.TRUE:
				{
					Boolean dest = null;
					if(operation == -1) {
						dest = true;
						if(negate)
							dest = !dest;
					} else {
						b = true;
						if(negate)
							dest = performOperation(operation, left, !b);
						else
							dest = performOperation(operation, left, b);
					}
					if(!foundIs) left = dest;
					else 	    right = dest;
					negate = false;
					break;
				}
				case czabtalParser.FALSE:
				{
					Boolean dest = null;
					if(operation == -1) {
						dest = false;
						if(negate)
							dest = !dest;
					} else {
						b = false;
						if(negate)
							dest = performOperation(operation, left, !b);
						else
							dest = performOperation(operation, left, b);
					}
					if(!foundIs) left = dest;
					else 	    right = dest;
					negate = false;
					break;
				}
				case czabtalParser.IDENT:
				{
					correctLogicalType(t.getToken().getText(), incomingContext);
					EntryData value = incomingContext.getVariable(t.getToken().getText());
					Boolean dest = null;
					if(operation == -1) {
						dest = (Boolean)value.getData();
						if(negate)
							dest = !dest;
					} else {
						b = (Boolean)value.getData();
						if(negate)
							dest = performOperation(operation, left, !b);
						else
							dest = performOperation(operation, left, b);
					}
					if(!foundIs) left = dest;
					else 	    right = dest;
					negate = false;
					break;
				}
				case czabtalParser.NOT:
					negate = true;
					break;
				case czabtalParser.AND:
				case czabtalParser.OR:
					operation = t.getToken().getType();
					break;
				case czabtalParser.IS:
					if(foundIs == true)
						throw new SemanticException("Only one 'is' may be used.", lineNumber);
					operation = -1;
					foundIs = true;
					break;
				default:
					throw new SemanticException("Unrecognized exception in logical sequence.", lineNumber);
			}
		}
		if(foundIs)
			return left == right;
		return left;
	}
		
	private static void newLine(CommonTree tree) {
		for(Object o : tree.getChildren()) {
			if(o != null)
				lineNumber += 1;
		}
	}
	
// POMOCNICZE ******************************************
	private static Boolean performOperation(int operation, Boolean a, Boolean b) {
		switch(operation) {
			case czabtalParser.NOT:
				return !b;
			case czabtalParser.AND:
				return a && b;
			case czabtalParser.OR:
				return a || b;
			default: // operation == -1, nie ustawiono operacji
				throw new SemanticException("No operation to perform.", lineNumber);
		}
	}
    
	private static void correctLogicalType(String name, ExecutionContext incomingContext) {
		EntryData value = incomingContext.getVariable(name);
		if(value == null) {
			if(incomingContext.getGateDef(name) != null)
				throw new SemanticException("Gatedef given, but logical expected.", lineNumber);
			throw new SemanticException("Undefined variable " + name + ".", lineNumber);
		} else if(value.getType() != Types.LOGICAL)
			throw new SemanticException("Logical type expected.", lineNumber);
	}
	
	private static void correctGateType(String name, ExecutionContext incomingContext){
		EntryData value = incomingContext.getVariable(name);
		if(value == null) {
			value = incomingContext.getGateDef(name);
			if(value == null)
				throw new SemanticException("Undefined gate or gatedef variable: " + name + ".", lineNumber);
			
		} else if(value.getType() != Types.GATE)
			throw new SemanticException("Logical found, but gate or gatedef expected.", lineNumber);
	}
	
	private static GatedefData findGatedefData(String name, int params, ExecutionContext incomingContext) {
		String newName = name;
		EntryData e = incomingContext.getVariable(newName);
		while(e != null) {
			if(e.getType() == Types.GATE) {
				newName = (String)e.getData();
				e = incomingContext.getVariable(newName);
			} else {
				throw new SemanticException("Logical found, but gate or gatedef expected.", lineNumber);
			}
		}
		EntryData func = incomingContext.getGateDef(newName, params);
		if(func == null) {
			if(incomingContext.getGateDef(newName) != null){
				if(newName.equals(name)){
					throw new SemanticException("Unable to find gatedef " + name + " with " + params + " parameters.", lineNumber);
				}else{
					throw new SemanticException("While resolving " + name + ". Unable to find gatedef " + newName + " with " + params + " parameters.", lineNumber);
				}
			}
			throw new SemanticException("Undefined gate or gatedef variable: " + name + ".", lineNumber);
		}
		return (GatedefData)func.getData();
	}

	private static Boolean executeFunction(GatedefData func, List<String> idki, ExecutionContext incomingContext) {
		EntryList arguments = func.getArguments();
		List<Boolean> args = new LinkedList<Boolean>();
		int index = 0;
		for(String id : idki) {
			correctLogicalType(id, incomingContext);
			EntryData val = incomingContext.getVariable(id);
			EntryData entry = arguments.get(index);
			if(entry.getName().equals("args")){
				args.add((Boolean) val.getData());
			} else {
				index += 1;
				entry.setData(val.getData());
			}
		}
		if(func.isArgs())
			arguments.get(index).setData(args);
		ExecutionContext context = new ExecutionContext();
		context.setOuterScope(mainContext.getInnerScope());
		context.setInnerScope(new EntryList());
		context.setParams(arguments);

		if(stack.contains(func))
			throw new SemanticException("Recursive Gatedef call.", lineNumber);
		stack.add(func);
		lineNumber = func.getPtr().getLine();
		polecenia_fun(func.getPtr(), context);
		stack.remove(func);
		Boolean returnValue = context.getReturnValue();
		if(returnValue == null)
			throw new SemanticException("Gatedef " + func.getName() + " execution finished, but no value returned.", lineNumber);
		
		context.setReturnValue(null);
		return returnValue;
	}
}
