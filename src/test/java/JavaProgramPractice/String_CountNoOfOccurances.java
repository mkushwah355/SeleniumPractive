package JavaProgramPractice;

//Count number of occurrence with created method
class String_CountNoOfOccurancesMethod{
	
	public static void main (String []arg) {
		
		int s=occuranceCount("aaasdfr",'a');
		System.out.println("Occurance with method: "+s);
	}
	public static int occuranceCount(String a, char b) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b) {
				count++;
			}		
		}		
		return count;
	}
}
//Count number of occurrence without created method
class String_CountNoOfOccurances {
	public static void main (String []arg) {
		
		String a= "My name is Mayank";//a= 3 times
		int count=0;
		for(int i=0;i<a.length();i++) {
			//System.out.print(a.charAt(i));
			if(a.charAt(i)=='a') {
				count++;
			}				
		}System.out.println(count);
	}
}
//Mayank way

class String_CountNoOfOccurancesMethod_MayankTrick {

	public static void main(String[] args) {
		
		String s= "My name is Mayank";
		char temp='a';
		int count =0;
		
		for(int i=0;i<s.length();i++){
			//System.out.print(s.charAt(i));
			if(temp==s.charAt(i)) {
				count++;
			}			
		}System.out.println(count);
}}

