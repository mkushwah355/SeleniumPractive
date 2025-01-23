package JavaProgramPractice;

//Reverse integer value WITHOUT converting to String
class Int_ReverseIntegerWITHOUTString {

	public static void main(String[] args) {
		
		int num=12345;
		int reverseInt=0;
		
		while(num!=0) {
			int lastDigit= num%10; //5----get the last digit
			 reverseInt=reverseInt*10+lastDigit;//0*10+5= 5--// Build the reversed number
			 num= num/10; //12345/10= 1234.5= 1234-----Remove the last digit
		}		
		System.out.println("Reverse integer value: "+reverseInt);		
	}}

//Reverse integer value after converting to String
 class Int_ReverseIntegerWITHString {

 	public static void main(String[] args) {
 		
 		int num =12345;
 		String a=Integer.toString(num);
 		String b="";
 		
 		for(int i=a.length()-1;i>=0;i--) {
 			//System.out.println(a.charAt(i));
 			b=b+a.charAt(i);
 		}
 		System.out.println(b);
 		
 		int result=Integer.parseInt(b);
 		System.out.println(result);	
 }}
