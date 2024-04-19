
package faltuCode;

public class finalKeyword{
	public static void main(String []agr) {
	
		finalKeyword s =new finalKeyword();
		
		System.out.println("faltucode.main()" + s.hashCode());
		
		s=null;
		System.gc();
		
		
	}
	
	
}