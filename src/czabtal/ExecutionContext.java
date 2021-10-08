package czabtal;

public class ExecutionContext {
	private EntryList outerScope;
	private EntryList innerScope;
	private EntryList params;
	private Boolean returnValue = null;
	
	public EntryList getOuterScope() {
		return outerScope;
	}

	public void setOuterScope(EntryList outerScope) {
		this.outerScope = outerScope;
	}

	public EntryList getInnerScope() {
		return innerScope;
	}

	public void setInnerScope(EntryList innerScope) {
		this.innerScope = innerScope;
	}

	public EntryList getParams() {
		return params;
	}

	public void setParams(EntryList params) {
		this.params = params;
	}

	public ExecutionContext() {
		this.outerScope = new EntryList();
		this.innerScope = new EntryList();
		this.params = new EntryList();
	}
	
	public ExecutionContext(EntryList outerScope, EntryList innerScope,
			EntryList params) {
		this.outerScope = outerScope;
		this.innerScope = innerScope;
		this.params = params;
	}

	public ExecutionContext(ExecutionContext ec) {
		this.outerScope = new EntryList(ec.getOuterScope());
		this.outerScope.addAll(ec.getInnerScope());
		this.innerScope = new EntryList();
		this.params = new EntryList(ec.getParams());
	}
	
	public void addVariable(String name, Types type, Object data) {

		// nie mozemy nadpisywac parametrow funkcji (o ile istnieja)
		if (params != null && this.params.find(name) != null) {
			throw new SemanticException("Variable already defined as a parameter and cannot be changed: " + name + ".", TreeWalker.lineNumber);
			// throw exception
		}

		EntryData tmp = this.innerScope.find(name);

		// mozemy dodac zmienna ktorej jeszcze nia ma
		if (tmp == null) {
			this.innerScope.add(new EntryData(name, type, data));
			return;
			// gatedefa drugiego mozemy dodac, ale nie z tymi samymi parametrami
		} else if (type == Types.GATEDEF && tmp.getType() == Types.GATEDEF) {
			GatedefData insertionData = (GatedefData) data;
			EntryList gateDefs = this.innerScope.findAll(name);
			for (EntryData ed : gateDefs) {
				GatedefData existingData = (GatedefData) ed.getData();
				if (insertionData.equals(existingData)) {
					throw new SemanticException("Gatedef cannot be redefined with the same signature: " + name + ".", TreeWalker.lineNumber);
					// exception
				}
			}
			this.innerScope.add(new EntryData(name, type, insertionData));
			
		} else {// juz cos takiego istnieje i nie mozemy dodac
			throw new SemanticException("Variable is already defined: " + name + ".", TreeWalker.lineNumber);
			// exception
		}

	}

	public EntryData getVariable(String name) {
		EntryData result = null;

		result = this.params.find(name);
		if (result != null && result.getType() != Types.GATEDEF)
			return result;
		
		result = this.innerScope.find(name);
		if (result != null && result.getType() != Types.GATEDEF)
			return result;
		
		result = this.outerScope.find(name);
		if (result != null && result.getType() != Types.GATEDEF)
			return result;
		
		return null;
	}

	public EntryData getGateDef(String name) {
		EntryList tmpList = null;
		tmpList = this.outerScope.findAll(name);
		if(tmpList.isEmpty()) {
			tmpList = this.innerScope.findAll(name);
			if(tmpList.isEmpty())
				return null;
		}
		return tmpList.get(0);
	}
	public EntryData getGateDef(String name, int nrOfParams) {
		EntryData best = null;
		EntryList tmpList = null;
		tmpList = this.innerScope.findAll(name);
		if (!tmpList.isEmpty()){
			best = findBest(tmpList, nrOfParams);
			if(best == null)
				throw new SemanticException("Cannot find gatedef " + name + " with " + nrOfParams + " parameters.", TreeWalker.lineNumber);
		}
		return best;
	}

	private EntryData findBest(EntryList list, int nrOfParams) {
		EntryData best = null;
		for(EntryData currentEd : list) {
			if(currentEd.getType() == Types.GATEDEF) {
				GatedefData gd = (GatedefData)currentEd.getData();
				if(gd.getNumberOfParams() == nrOfParams && !gd.isArgs())
					return currentEd;
				else if(gd.getNumberOfParams() < nrOfParams && gd.isArgs()) {
					if(best == null) {
						best = currentEd;
					} else {
						GatedefData bestGd = (GatedefData)best.getData();
						if(bestGd.getNumberOfParams() < gd.getNumberOfParams())
							best = currentEd;
					}
				}
			} else {
				throw new SemanticException("Unable to find gatedef.", TreeWalker.lineNumber);
			}
		}		
		return best;
	}
	
	public void setVariable(String name, Object data) {
		// nie mozemy nadpisywac parametrow funkcji (o ile istnieja)
		if (params != null && this.params.find(name) != null) {
			throw new SemanticException("Cannot modify parameter value " + name + ".", TreeWalker.lineNumber);
		}
		if (innerScope != null){
			EntryData found = innerScope.find(name);
			if(found == null) //nie ma takiej
				;// nie znaleziono w lokalach
			else if(found.getType() != Types.GATEDEF)
				found.setData(data);
			else {
				throw new SemanticException("Cannot redefine gatedef: " + name + ".", TreeWalker.lineNumber);		
			}
		}
		if (outerScope != null) {
			EntryData found = outerScope.find(name);
			if(found == null) //nie ma takiej
				throw new SemanticException("Cannot find variable " + name + ".", TreeWalker.lineNumber);
			else if(found.getType() != Types.GATEDEF)
				found.setData(data);
			else {
				throw new SemanticException("Cannot redefine gatedef: " + name + ".", TreeWalker.lineNumber);
			}
		}
	}
	
	public void print(){
		System.out.println("*** EXECUTION CONTEXT PRINT ***");
		System.out.println("OUTERSCOPE:");
		for(EntryData ed : outerScope){
			System.out.print(ed.getName() + " " + ed.getType() + " " + ed.getData() + "\n");
		}
		
		System.out.println("INNERSCOPE:");
		for(EntryData ed : innerScope){
			System.out.print(ed.getName() + " " + ed.getType() + " " + ed.getData() + "\n");
		}
		
		System.out.println("PARAMS:");
		for(EntryData ed : params){
			System.out.print(ed.getName() + " " + ed.getType() + " " + ed.getData() + "\n");
		}
		System.out.println("Return: " + getReturnValue());
		System.out.println("*** END OF EXECUTION CONTEXT PRINT ***");
	}

	
	public void setReturnValue(Boolean returnValue) {
		this.returnValue = returnValue;
	}

	public Boolean getReturnValue() {
		return returnValue;
	}
}
