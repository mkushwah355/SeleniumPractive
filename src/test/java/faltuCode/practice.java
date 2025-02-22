package faltuCode;

import java.util.*;
import java.util.TreeSet;

class practice {
    public static void main(String[] args) {
  
        int[] a= {1,2,5,3,4};//
        int[] b= {2,7,1,3,0};
     
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<a.length;i++) {
        	for(int j=0; j<b.length;j++) {
        	
        	if(a[i]==b[j]) {
        		//System.out.print(a[i]+","+b[j]);
        		al.add(a[i]);
        	}
        }   
    }System.out.println(al);
    for(Integer loop1:al) {
    	System.out.println(loop1);
    } 
}}
