
package FaltuCode;

public class finalKeyword{
	private static void main(String []agr) {
	
		finalKeyword s =new finalKeyword();
		
		System.out.println("faltucode.main()" + s.hashCode());
		
		s=null;
		System.gc();
		
		
	}
	
	
}