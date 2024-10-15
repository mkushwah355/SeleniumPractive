package JavaIntPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Compare two list and print common elements on console
public class List_commonElements {
		
		    public static void main(String[] args) {
		        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry");
		        List<String> list2 = Arrays.asList("Cherry", "Banana", "Apple","App2");
		        
		        ArrayList<String> AL= new ArrayList<String>();
		        
		        for(String e:list1) {
		        	if(list2.contains(e)) {
		        	AL.add(e);
		        	
		        	}
		        }System.out.println(AL);
		    }
		}


