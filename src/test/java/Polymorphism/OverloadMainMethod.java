package Polymorphism;

public class OverloadMainMethod {
	//JVM calls only main method which receives string array as arguments only
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	public static void main1 (String[] args){
		System.out.println("Second main method");
	}
	public static void main (int arg){
		System.out.println("Third main method with int argument");
	}
	public static void main (String arg){
		System.out.println("forth main method without string array");
	}
}
