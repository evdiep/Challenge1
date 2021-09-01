import java.io.*;
import java.util.*;
import java.util.ArrayList.*;

public class Id_System {
	
	ArrayList<String> ids = new ArrayList<String>();
	
	public void addUser(String name) {
		String id_prefix = createId_prefix(name);
		String id_suffix = createId_suffix(name);
		ids.add(id_prefix+id_suffix);
		
	}
	    /*	
	    * returns String with up to the first three letters of the input name
	    */
	private String createId_prefix(String name) {
		String ret = ""; 
		if (name.length()>=3) {
			ret = name.substring(0, 3);
			}
		else {
			return name.toUpperCase();
		}
		ret = ret.toUpperCase();
		return ret; 
	}
	 /*
	 * returns String of the correct suffix number in a String format
	 */
	private String createId_suffix(String name) {
		//store int in string and use .length to count
		int id_num = 5; 
		String check = "";
		while(true) {
			if(id_num<1000) {
				 check = createId_prefix(name) + String.format("%03d", id_num);
			}
			else {
				 check = createId_prefix(name) + Integer.toString(id_num);
			}
			if (!ids.contains(check)) {
				break;
			}
			id_num +=5;
		}
		if(id_num<1000)
			return String.format("%03d",id_num);
		else 
			return Integer.toString(id_num);
	}
	
	public void print() {
		for(int i = 0; i<ids.size(); i++) 
			System.out.println(ids.get(i));
	}
}


