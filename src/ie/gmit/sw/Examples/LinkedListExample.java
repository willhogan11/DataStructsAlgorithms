package ie.gmit.sw.Examples;

import java.util.HashMap;
import java.util.Map;


public class LinkedListExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Will");
		map.put("Address", "Galway");
		map.put("Age", "39");
		
		for(Map.Entry<String, String> m : map.entrySet()){
			System.out.println(m);
		}
	}
}