package SDET_Interview_Programs;
import java.util.*;

//Aim: Write a java program to get the matching text from below 
class Wipro_2stInterview_PrintCommonWords {
	public static void main(String[] args) {
		
		String s1 = "I am in Pune";
		String s2 = "I am in Mumbai"; //output= I am in

		String[] str1 = s1.split("\\s+");
		String[] str2 = s2.split("\\s+");
		String s3 = "";

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {  
					s3 = s3 + str1[i] + " ";
				}
			}
		}
		System.out.print(s3);
	}
}