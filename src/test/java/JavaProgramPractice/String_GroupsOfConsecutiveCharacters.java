package JavaProgramPractice;

//Java code to find number of groups of consecutive characters in a string(geeksforgggeeks-> total 3(ee, kk,ggg))
public class String_GroupsOfConsecutiveCharacters {

  public static void main(String[] args) {
      String str = "geeksforgggeeks";
     
      int count = 0;

      for (int i = 0; i < str.length()-1; i++){
          if (str.charAt(i) == str.charAt(i + 1)) {
              count++;
              while (str.charAt(i) == str.charAt(i + 1)) {
                  i++;
              }
          }         
      }

      System.out.println("Number of groups of consecutive characters: " + count); // Output should be 3
  }
}
