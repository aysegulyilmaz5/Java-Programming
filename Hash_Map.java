package jhashmap;

import java.util.HashMap;

public class Hash_Map {
	public static void main(String[] args) {
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Turkey","Istanbul");
		capitalCities.put("USA","Washinghton");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("Germany"));
		for(String i : capitalCities.keySet())
			System.out.println(i);
	}

}
