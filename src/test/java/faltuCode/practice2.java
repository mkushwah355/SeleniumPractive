package faltuCode;

//create a method to check prime number or not
//Prime no. b/w 1 to 10= 2,3,5,7

public class practice2 {
	
	int a= 1;
	int b=	7;
	public static void main(String[]arg) {
		for(int num=1;num<=7;num++) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
		
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {			
			if(num%i==0) {
				return false;
			}
			
		}
		if(num<=1) {
			return false;
		}
		
		return true;
	}
	}
	
	
	
	
	
