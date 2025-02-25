package Java_Programs;

//Aim: Sum of integers
class Int_2SumOfIntegers {
	 
	 public static void main (String[]arg) {
		 
		int a= 1234; //output= 10
		int sum=0;
		
	while(a>0) {	
		//int temp= a%10;
		sum= sum + a%10;   //0+4;123;//123;4+3;//12;7+2//1;9+1
		a=a/10;
	}
	System.out.println("sum of integers: "+sum);	
		 
	 } 
}


/*Note: Just keep this two points in mind when dealing with pure int values.
	  a%10--Modulus of a by 10 gives the last digit of integer value(i.e. a%10 of 1234 will give 4)
	  a/10--Division of a by 10 gives the initial digits of last digit(i.e. a/10 of 1234 will give 123)*/
	  