package Java_Programs;

//Aim: Replace last word of string with 123.

 class _22String_ReplaceLastWordsOfString {
    public static void main(String[] args) {
        String s = "Mayank is good";

        // Replace "good" with "123"
        String good = s.replace("good", "123");

        // Extract and reverse the remaining part
        String initial = new StringBuilder(s.substring(0, 9)).reverse().toString();

        // Combine and print the result
        System.out.println(initial + good.substring(9));
    }
}