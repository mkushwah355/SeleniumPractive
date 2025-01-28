package JavaProgramPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Remove second highest element from HashMap with for loop.
public class Arrays_SecondHighestElementFromHashMapWithForLoop {
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
