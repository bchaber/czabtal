package czabtal;

public class FileEntry {
	private int from;
	private int to;
	private String filename;
	private int offset;
	
	public FileEntry(int from, int to, String filename, int offset) {
		this.setFrom(from);
		this.setTo(to);
		this.setFilename(filename);
		this.setOffset(offset);
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public int getTo() {
		return to;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getFrom() {
		return from;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getOffset() {
		return offset;
	}
}
