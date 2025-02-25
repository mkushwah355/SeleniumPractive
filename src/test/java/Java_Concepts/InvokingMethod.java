package Java_Concepts;

 class Student {
//id and name are instance variable for class Student.
		int id;
		String name;

 void display() {
//id and name are local variables for display() method.
//Priority given to local vocal variables if declared within the method.	 

			/*int id=123;
			String name="dsds";*/
			System.out.println(id + name);}}
 
//to access the instance variables of different class, main method name(i.e. Student) should be same with instance variable containing class(i.e Student).   
//to run java class, main method containing class and java class file name should be same. Otherwise, run java application option won't appear.
//
 class InvokingMethod {
	 public static void main(String[] arg) {

		 Student s1 = new Student();  //main method name (i.e. Student)

			s1.id=123;
			s1.name = "efe";

			s1.display();}
}


