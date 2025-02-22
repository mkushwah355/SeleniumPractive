package JavaProgramPractice;
import java.util.ArrayList;
import java.util.List;

//Aim: Create list of list and iterate.
public class List_ListOfList {

	public static void main (String[]arg) {
		
//Create the innermost lists	
	List<Integer> innerList1= new ArrayList<Integer>();
	innerList1.add(5);
	innerList1.add(1);
	innerList1.add(6);
		
	List<Integer> innerList2= new ArrayList<Integer>();
	innerList2.add(2);
	innerList2.add(4);
	innerList2.add(7);
	
//Create the middle lists	
	List<List<Integer>> middleList1= new ArrayList<List<Integer>>();
	middleList1.add(innerList1);
	middleList1.add(innerList2);
	
// Create the outermost list	
	List<List<List<Integer>>> listOfList= new ArrayList<List<List<Integer>>>();
	listOfList.add(middleList1);
	
	System.out.println("List of List of List: "+listOfList);
	
//Iterate listOfList
for (List<List<Integer>> outerList : listOfList){
	for (List<Integer> middleList : outerList){
		for (Integer value : middleList){ 
			System.out.println("Value: " + value);}
		}
}
	

}}
