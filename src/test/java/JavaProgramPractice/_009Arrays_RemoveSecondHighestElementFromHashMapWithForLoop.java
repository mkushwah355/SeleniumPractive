package JavaProgramPractice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Aim: Remove second highest element from HashMap with for loop.
 class _009Arrays_RemoveSecondHighestElementFromHashMapWithForLoop {
    public static void main(String[] args) {
    	
    Map<String, Integer> map= new HashMap<String, Integer>();	
    	map.put("a", 10);
        map.put("b", 3);
        map.put("c", 15);
        map.put("d", 20);
        map.put("e", 7);
    	
    	//System.out.println(map);
    	
    	int largest= Integer.MIN_VALUE;
    	int second_largest= Integer.MIN_VALUE;
    	String largestKey = "";
    	String second_largestKey= "";
    	
    	Set<Map.Entry<String, Integer>>entry=map.entrySet();
    	
    	for(Map.Entry<String, Integer> loop1:entry) {
    		int value=loop1.getValue();
    		
    		if(value>largest) {
    			second_largest=largest;
    			largest=value;
    			second_largestKey=largestKey;
    			largestKey=loop1.getKey();
    		}else if(value>second_largest && value!=largest) {
    			second_largest=value;
    			second_largestKey= loop1.getKey();
   			
    		}
    	}System.out.println("Largest integer value in HashMap: "+largest);
    	 System.out.println("Second Largest integer value in HashMap: "+second_largest);
    	 
       	 map.remove(second_largestKey);
    	 System.out.println("Updated map: "+map);
			/*for(Map.Entry<String, Integer> loop2:entry) {
			
				 System.out.println(loop2);
			}*/    	
    }
}

//Aim: Remove second highest element from HashMap with for loop using collection methods.

 class Arrays_SecondHighestElementFromHashMapThroughCollection {

 	public static void main(String[] args) {

 		Map<String, Integer> map = new HashMap<String, Integer>();
 		map.put("a", 10);
 		map.put("b", 3);
 		map.put("c", 15);//remove
 		map.put("d", 20);
 		map.put("e", 7);

 		Map<Integer, String> sortedMap = new TreeMap<Integer, String>();

 		for (Map.Entry<String, Integer> loop1 : map.entrySet()) {

 			sortedMap.put(loop1.getValue(), loop1.getKey());
 		}
 		//System.out.println(sortedMap);

 		List<Integer> list = new ArrayList<Integer>(sortedMap.keySet());
 		Integer secondLast = list.get(list.size() - 2);

 		list.remove(secondLast);
 		
 		System.out.println("Second highest element removed(15): "+list);

 	}

 }
 
 
 