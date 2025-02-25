package Java_Programs;

//Aim: Find number of vowels & consonants in string
 class _02String_NoOfVowelsConsonantsInString {
	public static void main(String[] args) {
		
		String s1= "Count vowels and consotansts in this string";
		String s2= s1.replaceAll("\\s", "");
		String str=s2.toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<str.length();i++) {
			char s3=str.charAt(i);
			if(s3=='a' || s3=='e' || s3=='i'|| s3=='o'|| s3=='u') {
				vowels++;
			}else {
				consonants++;
			}			
		}
		System.out.println("No. of vowels: "+vowels);
		System.out.println("No. of consonants: "+consonants);		
	}	
}
//Aim:  Find number of vowels & consonants in string with equals method
 
 class _02String_NoOfVowelsConsonantsInString2 {
		public static void main(String[] args) {
			
	        String s= "My name is Mayank";
			String s2=s.toLowerCase();
			String[] str=s2.replaceAll(" ", "").split("");
			
	       int vowels=0; 
	       int consonants=0;
	       
	       for(int i=0;i<str.length;i++){
	           if(str[i].equals("a") || str[i].equals("e") || str[i].equals("i") || str[i].equals("o") || str[i].equals("u")){
	               vowels++;
	           }else{
	               consonants++;
	           }
	       }System.out.println(vowels+":"+consonants);
	        
	    }
	}