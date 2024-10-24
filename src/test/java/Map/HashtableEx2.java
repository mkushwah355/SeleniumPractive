package Map;

import java.util.Hashtable;

public class HashtableEx2{
	
	public static void main (String []arg) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String> ();
		h.put(5,"A"); //5%11= 5
		h.put(6,"B"); //6%11= 6
		h.put(15,"C");//15%11= 4
		h.put(23,"D");//23%11= 1
		h.put(34,"E");//34%11= 1
		System.out.println(h.toString());	 //{6=B,5=A,15=C,34=E,23=D}	
}}
