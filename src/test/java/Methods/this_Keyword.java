package Methods;

//Aim: Output= Mayank 
/*In the display method, this.name = myName; assigns the value of the parameter myName to the instance variable name.
Now, this.name holds the value "Mayank", which is returned and printed correctly.
*/

class this_Keyword1 {

	String name;

	public String display(String myName) {
//"name" instance variable getting initialized when assigning this.name=myName		  
		this.name = myName; //this.name; refers to the instance variable of the class(i.e String name).//assigning a value to this.name (the instance variable) within the method
		return myName; //myName; refers to the method parameter(i.e myName).//return this.name; will also give same output=Mayank
	}

	public static void main(String[] arg) {
		this_Keyword1 s1 = new this_Keyword1();

		String s2 = s1.display("Mayank");

		System.out.println(s2);//output= Mayank
	}
}

//Aim: Output= null
/*In the method display(String myName), the assignment myName = this.name; is happening.Here, this.name refers to the instance variable, which is still null because it hasn’t been initialized.
As a result, myName gets assigned the value null, which is then returned by the method.
*/
class this_Keyword2 {

	String name;

	public String display(String myName) {
		myName = this.name;//this.name refers to the instance variable, which is still null because it hasn’t been initialized. 
		return this.name;
	}

	public static void main(String[] arg) {
		this_Keyword2 s1 = new this_Keyword2();

		String s2 = s1.display("Mayank");

		System.out.println(s2); //output= null
	}
}
