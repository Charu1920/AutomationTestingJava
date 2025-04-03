package practice;

import java.util.*;

public class Hashing {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap();
		
		map.put("india", 120);
		map.put("china", 140);
		map.put("srilanka", 190);
		
		System.out.println(map);
		map.put("china", 180);
		System.out.println(map);

	}

}
