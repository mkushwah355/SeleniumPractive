package Java_Programs;


//Aim: Difference b/w "==" & "equal" method.
public class equalOpertor {

	public static void main(String[] arg) {

		String a = "test";
		String b = "test";
		
		String s1 = new String("test");
		String s2 = new String("test");
				
		System.out.println(a==b);		  //true
		System.out.println(a.equals(b));  //true		
		System.out.println(s1==s2);		  //false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(a==s1);       //false
		System.out.println(a.equals(s1));//true
		
		

//hashCode():The hashCode() method in Java returns a hash code value for the object, which is derived from the content of the string. 
//Since a, b, s1, and s2 all have the same content "test", their hashCode() values will be identical.		
//System.identityHashCode():The System.identityHashCode() method returns a hash code that is based on the memory address of the object, rather than its content. 
//This is why you see different values for s1 and s2, as they are distinct objects created in the heap. Similarly, a and b both refer to the same string literal in the string pool, so their identityHashCode() values are the same.
		
		System.out.println(System.identityHashCode(b) +"-"+b.hashCode()); //1252585652-3556498
		System.out.println(System.identityHashCode(a)+"-"+a.hashCode());  //1252585652-3556498
		System.out.println(System.identityHashCode(s1)+"-"+s1.hashCode());//2036368507-3556498
		System.out.println(System.identityHashCode(s2)+"-"+s2.hashCode());//1785210046-3556498
		
	}
}
