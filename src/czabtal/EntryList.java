package czabtal;

import java.util.*;

public class EntryList extends ArrayList<EntryData>{
	private static final long serialVersionUID = 1154386118341951492L;

	public EntryList(){
		super();
	}

	public EntryList(EntryList list) {
		super(list);
	}

	public EntryData find(String name){
		for (EntryData ed : this){
			if(ed.getName().equals(name))
				return ed;
		}
		return null;
	}
	
	public EntryList findAll(String name){
		EntryList result = new EntryList();
		for (EntryData ed : this){
			if(ed.getName().equals(name))
				result.add(ed);
		}
		return result;
	}
	
}
