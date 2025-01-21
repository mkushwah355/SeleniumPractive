package JavaProgramPractice;

//Aim: Print maximum number difference b/w any adjacent index in array

public class Arrays_MaxDiffAnyAdjcentIndex {	
	
	public static void main(String[] args) {
		
		int[] a= {1,4,8,15,17}; //difference b/w adjacent index=[3,4,7,2]//output= 7 (7 is max. diff b/w any adjacent index)
		int diff=0;
		for(int i=0;i<a.length-1;i++) {
			//System.out.println(a[i]);
			//int adjacentDiff= a[i+1]-a[i];//it will give difference b/w adjacent number
			//System.out.print(adjacentDiff +" ");
			
			if (a[i+1]-a[i]>diff) {
				diff=a[i+1]-a[i];				
			}			
		}
		System.out.println(diff); //output=7	
	}
}