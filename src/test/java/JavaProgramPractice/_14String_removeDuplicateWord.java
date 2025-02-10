package JavaProgramPractice;
import java.util.LinkedHashSet;
import java.util.Set;

//Aim: Remove duplicate words from string
public class _14String_removeDuplicateWord {
	public static void main(String[] args) {

		String str = "Goodbye bye bye world world world\n"
				+ "Sam went went to to to his business\n"
				+ "Reya is is the the best player in eye eye game\n"
				+ "in inthe\n"
				+ "Hello hello Ab aB";
		String[] charStr = str.split("\\s+");

		Set<String> LHS = new LinkedHashSet<String>();

		for (String loop1 : charStr) {
			
			LHS.add(loop1.toLowerCase());
		}
		System.out.println(LHS);

		for (String loop2 : LHS) {
			System.out.print(loop2 + " ");
		}
		
	}
}