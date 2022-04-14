package Polymorphism;

/*From Java 5.0 onwards it is possible to have different return type for an overriding method in child class, 
but child’s return type should be sub type of parent’s return type. This phenomena is known as Covariant return type
Covarient return type works only for non-primitive return types. 
(i.e. Class, object, array, string, and interface are called non-primitive data types in Java.)
*/
class covarientReturnType {
	
	Object show(){
		System.out.println("print 1");
		return null;
	}	
}
class XYZ extends covarientReturnType{
	//child’s class method return type should always be sub type of parent’s return type(i.e. String)
	//"String" is sub return type of "Object" parent return type.
	String show(){                   
		//super.show();
		System.out.println("print 2");
		return null;
		
	}
	public static void main (String[] arg){
		XYZ a=new XYZ();
		a.show();
		covarientReturnType b=new covarientReturnType();
		b.show();
		
	}	
}
