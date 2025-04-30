package Java_Programs;
import java.util.*;

class List_ListOfHashMap {
	public static void main(String[] args) {

		Map<String, Integer> h = new HashMap<String, Integer>();
		h.put("D", 1);
		h.put("C", 2);
		h.put("B", 4);
		h.put("S", 3);
		System.out.println("Original hashMap: "+h);

//Convert Map Entries to a List
		List<Map.Entry<String, Integer>> listEntry = new ArrayList<>(h.entrySet());
		System.out.println("listEntry: "+listEntry); 
	    //Collections.sort(listEntry);//Collection.sort()-require comparable object
		
		Collections.sort(listEntry, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				return obj1.getKey().compareTo(obj2.getKey());
			}
		});
		System.out.println("Sorted listEntry: "+listEntry);

//Convert Map Values to a List
		List<Integer> listValues = new ArrayList<>(h.values());
		System.out.println("listValues: "+listValues); 
		Collections.sort(listValues, new Comparator<Integer>(){
			public int compare(Integer obj1, Integer obj2) {
				return obj1.compareTo(obj2);
			}
		});
		System.out.println("Sorted listValues: "+ listValues);
		
//Convert Map Keys to a List
		List<String> listKeys = new ArrayList<>(h.keySet());
		System.out.println("listKeys: "+listKeys);
		
		Collections.sort(listKeys,new Comparator<String>() {
			public int compare(String obj1, String obj2) {
				return obj1.compareTo(obj2);}
			}
		);		
		System.out.println("Sorted listKeys: "+listKeys);		
	}
}

