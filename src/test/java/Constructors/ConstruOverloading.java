package Constructors;

public class ConstruOverloading {
		
	ConstruOverloading(double d){
		this(10);
		System.out.println("Double arg constructor");
	}
	ConstruOverloading(int d){
		this();
		System.out.println("Int arg constructor");
	}
	ConstruOverloading(){
		System.out.println("no- arg constructor");
	}
	public static void main (String []arg) {
		
		ConstruOverloading t1= new ConstruOverloading(10.5);
		//ConstruOverloading t2=new ConstruOverloading(10);
		//ConstruOverloading t3=new ConstruOverloading();
	}
}
