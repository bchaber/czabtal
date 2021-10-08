package czabtal;

import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 *
 * @author Adam Wojtal, Bartek Chaber
 */
public class Main {
	public static void main(String[] args) throws RecognitionException, IOException, Exception {
		CharStream input = null;
		String defInput = "print true\n";
		if (args.length > 0) {
			String file = Precompiler.precompile(args[0]);
			input = new ANTLRStringStream(file);
		} else {
			input = new ANTLRStringStream(defInput);
		}
		int errors = 0;
		czabtalLexer lexer = new czabtalLexer(input);
		if (errors > 0) {
			throw new LexicalException("Found " + errors + " lexical errors");
		}
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		czabtalParser parser = new czabtalParser(tokenStream);
		czabtalParser.start_return ret = null;
		try {
			ret = parser.start();
		} catch (RewriteEmptyStreamException e) {
			throw new SyntaxException("Empty definition begin...end block found.");
		}
		errors = parser.getNumberOfSyntaxErrors();
		if(errors > 0) {
			throw new SyntaxException("Found " + errors + " sytax errors");
		}
		CommonTree tree = null;
		tree = (CommonTree)ret.getTree();
		TreeWalker.start(tree);
	}

	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				if(t.getChild(i).toString().trim().isEmpty())
					continue;
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
}
