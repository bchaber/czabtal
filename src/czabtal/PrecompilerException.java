package czabtal;

public class PrecompilerException extends RuntimeException {
	private static final long serialVersionUID = -4611825928529602932L;
	private Integer line = null;
	
	public PrecompilerException(String message) {
		super(message);
	}
	
	public PrecompilerException(String message, int line) {
		super(message);
		this.line = line;
	}
	
	@Override
	public String toString() {
		String s = "";
		if(line != null) {
                    String pos = Precompiler.getPositionForLine(line);
                    s = pos + ": "+ getMessage();
                } else {
			s = getMessage();
                }
                return s;
	}
}
