package day48_Inheritance02_Super;

public class _01_Bin {
	
	private String contents;
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public _01_Bin() {
		
		this("general");
		
//		contents = "";
//		type = "general";
		
	}
	
	public _01_Bin(String type) {
		
		contents = "";
		this.type = type;
		
	}
	
	public void add(String thing) {
		
		if(contents.isEmpty()) {
			contents = thing;
		} else {
			contents += "," + thing; 
		}
		
	}
	
	public boolean remove(String thing) {
		
		String temp = contents.toLowerCase();
		thing = thing.toLowerCase().trim();
		
		if(temp.contains(thing)) {
			if(temp.startsWith(thing)) {
				temp = temp.replace(thing, "");
				temp = temp.isEmpty() ? temp : temp.substring(1);
			} else {
				temp = temp.replace("," + thing, "");
			}
			
			contents = temp;
			return true;
			
		} else {
			return false;
		}
		
		
	}
	
	public void empty() {
		
		contents = "";
		
	}
	
	public String toString() {
		
		return "Bin ("+ type +") contains ["+ contents +"]"; 
		
	}
	
	
	

}
