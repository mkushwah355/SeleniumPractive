package JavaProgramPractice;

//Aim: Print star
public class PrintStar {
	public static void main(String[] arg) {
//*		
//* *
//* * *
//* * * *
		for(int i=1;i<5;i++) { //outer loop prints 4 rows
			
			for(int j=1;j<=i;j++) {//inner loop take care the logic of printing right format 
				
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		
		
	}

}
