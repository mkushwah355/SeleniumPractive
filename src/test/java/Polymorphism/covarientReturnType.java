package Polymorphism;

class parentClass {

	Object show() {
		System.out.println("parentClass");
		return null;
	}
}
class covarientReturnType extends parentClass {
	//child’s class method return type should always be sub type of parent’s return type(i.e. String)
	//"String" is sub return type of "Object" parent return type.
	String show() {
		//super.show();
		System.out.println("childClass");
		return null;

	}

	public static void main(String[] arg) {
		covarientReturnType a = new covarientReturnType();
		a.show();
		parentClass b = new parentClass();
		b.show();

	}
}
