package JavaProgramPractice;

//Swap variables with or without temp variable.
public class SwapVariablesWithOrWithoutTempVariable {

	public static void main(String[] arg) {

		int a = 4;
		int b = 5;
		int temp;
		
//with temp variable		
		temp = a; //temp=4 
		a = b;    //a=5
		b = temp; //b=4

		System.out.println("Now value of 'a' is: "+a);
		System.out.println("Now value of 'b' is: "+b);

//Without temp variable		
		a = a + b; //a=4+5=9
		b = a - b; //b=9-5=4 //at this step "a" value become 9 instead of 4
		a = a - b; //a=9-4=5 //at this step "b" value become 4 instead of 5	
		
		System.out.println("Now value of 'a' is: "+a);
		System.out.println("Now value of 'b' is: "+b);

	}

}