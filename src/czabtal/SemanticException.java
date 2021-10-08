package czabtal;

public class SemanticException extends RuntimeException {
	private static final long serialVersionUID = -1252113961623007184L;
	private String position;
	public SemanticException(String message, int line) {
		super(message);
		this.position = Precompiler.getPositionForLine(line);
	}
	
	@Override
	public String toString() {
		String s = position + " : " + getMessage();
		return s;
	}
}
