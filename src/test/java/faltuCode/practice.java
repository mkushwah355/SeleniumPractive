package faltuCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


class calNoOfDays{
	
	static int noOfDays(int year, int month) {
		int noOfDays=0;
		
		switch (month) {
		case 1:
			noOfDays=31;
		case 2:
			noOfDays=29;
		case 3:
			noOfDays=29;
		case 4:
			noOfDays=29;
		default:
			System.out.println("invalid month");
		
		
	}return noOfDays;
	
	
	
	
}}



class practice {

	public static void main (String[]arg) {
	
		calNoOfDays.noOfDays(0, 0);
		
		
		
		
		
}}
