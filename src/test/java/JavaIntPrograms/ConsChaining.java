package JavaIntPrograms;

/*class ConsChaining {  

	
	ConsChaining() {
		this(1, "ss");
		
		System.out.println("default Cons");
	}
	ConsChaining(int a, String b){
		
		System.out.println("param Cons");
		
	}
	
	public static void main (String [] arg) {
		
		ConsChaining s1= new ConsChaining();
		
		
	}
}*/
//test ajay

class ConsChaining1 extends Const2{


	ConsChaining1(int a, String b){
		super(1,"dsd",2);
		
 	System.out.println("ss");
		
	}
	ConsChaining1(){
		this(1,"s");
	}}
	public class ConsChaining{ 
	
	public static void main (String []arg) {
		ConsChaining1 s1= new ConsChaining1();
		
	}
}
