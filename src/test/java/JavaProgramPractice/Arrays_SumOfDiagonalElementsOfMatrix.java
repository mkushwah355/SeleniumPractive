package JavaProgramPractice;

//Find sum of diagonal elements of array matrix.
public class Arrays_SumOfDiagonalElementsOfMatrix {

	public static void main(String[] args) {
		
		int[][] a= {  {1,2,3,5},
					  {5,6,7,8},
					  {9,1,2,3},
					  {4,5,6,7} };   //output: primary=16, secondary= 17
//primary=left to right, secondary= right to left		
		int primary=0;
		int secondary=0;
		
		for(int i=0; i<a.length;i++) {
			primary= primary+ a[i][i];
			secondary= secondary+a[i][a.length-1-i];
			
		} System.out.println(primary);
		  System.out.println(secondary);
			}
		
		
	
}
