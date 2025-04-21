package faltuCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class CompareArrayListExample7 {
	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
		System.out.println("First List: " + firstList);
		
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));
		System.out.println("Second List: " + secondList);
		
		// Finds common elements   
		//System.out.println("common elements: " + firstList.stream().filter(secondList::contains).collect(Collator));
		System.out.print(
				"Common elements: " + firstList.stream().filter(secondList::contains).collect(Collectors.toList()));
	}
}