package JavaProgramPractice;

//Find number of vowels & consonants in string
public class String_NoOfVowelsConsonantsInString {

	public static void main(String[] args) {
		
		String s1= "Count vowels and consotansts in this string";
		String s2= s1.replaceAll("\\s", "");
		String str=s2.toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++) {
			char s3=str.charAt(i);
			if(s3=='a' || s3=='e' || s3=='i'|| s3=='o'|| s3=='u') {
				vowels++;
			}else {
				consonants++;
			}			
		}
		System.out.println("No. of vowels: "+vowels);
		System.out.println("No. of consonants: "+consonants);		
	}	
}
