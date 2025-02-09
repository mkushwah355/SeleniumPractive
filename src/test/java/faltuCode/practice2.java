package faltuCode;

import java.util.*;

class practice2 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } };
	
		int sum=0;
		int count=0;
	
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				
				if(i==j) {
					sum=sum+a[i][j];
				}
				
			count++;
		}}
		
		
		System.out.println("Sum of diagonal elements: "+sum);



	}
}