package czabtal;

import org.antlr.runtime.tree.CommonTree;

public class GatedefData {
	private String name;
	private int numberOfParams;
	private boolean isArgs;
	private EntryList arguments;
	private CommonTree ptr;// wskaznik na miejsce w drzewie

	public int getNumberOfParams() {
		return numberOfParams;
	}

	public void setNumberOfParams(int numberOfParams) {
		this.numberOfParams = numberOfParams;
	}

	public boolean isArgs() {
		return isArgs;
	}

	public void setArgs(boolean isArgs) {
		this.isArgs = isArgs;
	}

	public void setPtr(CommonTree ptr) {
		this.ptr = ptr;
	}

	public CommonTree getPtr() {
		return ptr;
	}

	public void setArguments(EntryList arguments) {
		this.arguments = arguments;
	}

	public EntryList getArguments() {
		return arguments;
	}
	
	public boolean equals(GatedefData other){
		return (other.name.equals(this.name)) &&
			(other.numberOfParams == this.numberOfParams) && 
			(other.isArgs == this.isArgs);
	}
	
	public String toString(){
		String ret = this.numberOfParams + " " + this.isArgs;
		return ret;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
