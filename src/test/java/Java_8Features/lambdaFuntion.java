package Java_8Features;


interface ola{    //it is functional interface which can have only one abstract method but can have any no. of default and static methods.
	public String m1(String a, String b);
	
}

class cab implements ola{
public String m1(String source, String destination) {
		System.out.println(source+ destination);
		return "";
}}

/*public class lambdaFuntion {
	public static void main (String[]arg) {
		ola s1= new cab();
		s1.m1("Indore", "Pune");
		}}
	*/
//Lamda function don't have name, return type and access modifier. Also, data type of variable not required as compiler will take care of it.

public class lambdaFuntion{
	public static void main (String[]arg) {
//If there are more than one statement 	than specify in curly braces after lamda expression.	
		ola s1=(a,b)->{System.out.println("Source: "+a+ " Destination: "+ b); return ("price-500");};
		s1.m1("Indore", "Pune");}
	}
		

	


