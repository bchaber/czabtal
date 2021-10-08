package czabtal;

public class EntryData {
	private String name;
	private Types type;
	private Object data;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Types getType() {
		return type;
	}
	private void setType(Types type) {
		this.type = type;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public EntryData(String name, Types type, Object data){
		this.setName(name);
		this.setType(type);
		this.setData(data);
	}
	
}
