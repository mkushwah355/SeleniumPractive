package JavaIntPrograms;

class Factorial{
	
	public static void factNum(int n) {
		
		int factorial=1;
		for(int i=1;i<=n;i++) {
			
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}
	
	public static void main (String []arg) {
		
		factNum(5);
	}
	
	
}




/*public class Factorial {
	
	void fact1(int n) {
		int fact=1;
		
		for (int i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);	
		
	}
	public static void main (String []arg){
		
		new Factorial().fact1(5);
		
	}
}*/
