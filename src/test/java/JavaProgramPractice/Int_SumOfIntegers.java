package JavaProgramPractice;

//Sum of integers
class Int_SumOfIntegers {
	 
	 public static void main (String[]arg) {
		 
		int n= 1234; //output= 10
		int sum=0;
		
	while(n>0) {	
		int temp= n%10;
		sum= sum+temp;
		n=n/10;
	}
	System.out.println("sum of integers: "+sum);	
		 
	 }
	 
	 
	 
}
