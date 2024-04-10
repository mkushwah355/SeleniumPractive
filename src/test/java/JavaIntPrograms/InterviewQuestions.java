package JavaIntPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class InterviewQuestions {


public static boolean test(int num) {

if(num<=1)
return false;
else
{
 
 for(int i=2; i<num; i++)
  {
    if(num%i==0)
    { return false;}
  }

}
return true;
}



//******************************************************//
public static void swapString() {

String str1 = "VivekAnand";
String str2 = "Verma";
int len = str1.length();
String str = str1+str2;
str1 = str.substring(len);
str2 = str.substring(0,len);

System.out.println(str1+" "+str2);

}


//******************************************************//
public static void fibonacci(int size)
{
int[] fib = new int[size];
fib[0]=0;
fib[1]=1;

for(int i=2;i<size;i++)
{
fib[i] = fib[i-2]+fib[i-1];
}

for(int i=0; i<size;i++)
{
System.out.print(fib[i]+" ");
}
}

//*****************************************************//

public static void sumofDigits(int num)
{

int sum=0;
while(num!=0)
{
int digit = num%10;
sum= sum+digit;
num = num/10;
}

System.out.println(sum);
}


//******************************************************//
public static void reversetheNumber(int num)
{
while(num!=0)
{
int digit = num%10;
System.out.print(digit);
num=num/10;
}
}

//*******************************************************//
 public static void allZerosToRight() {

int[] num = {1,0,5,2,9,3,0,4,7,0,5,6,0,1};
int len = num.length;

ArrayList<Integer> numlist = new ArrayList<>();

for(int i=0; i<len; i++)
{
if(num[i]!=0)
{
numlist.add(num[i]);
}
}

for(int i=0; i<len; i++)
if(num[i]==0)
{
numlist.add(num[i]);
}

System.out.println(numlist);
 }


 //*****************************************************************//
public static void allZerosToLeft() {

int[] num = {1,0,5,2,9,3,0,4,7,0,5,6,0,1};
int len = num.length;

ArrayList<Integer> numlist = new ArrayList<>();

for(int i=0; i<len; i++)
{
if(num[i]==0)
{
numlist.add(num[i]);
}
}
for(int i=0; i<len; i++)
if(num[i]!=0)
{
numlist.add(num[i]);
}
System.out.println(numlist);
 }


//**************************************************************//
public static void charCount(String str)
{
char[] ch = str.toCharArray();
HashMap<Character,Integer> map = new HashMap<>();
for(char c: ch)
{
if(map.containsKey(c))
{
map.put(c, map.get(c)+1);
}
else
{
map.put(c, 1);
}
}

for(Map.Entry<Character,Integer> element: map.entrySet())
{
System.out.println(element.getKey()+" "+element.getValue());
}
}

//******************************************************************//
public static void duplicateChar(String str)
{
char[] ch = str.toCharArray();

HashMap<Character,Integer> map = new HashMap<>();

for(char c : ch)
{
if(map.containsKey(c))
{
map.put(c, map.get(c)+1);
}
else
{
map.put(c, 1);
}
}

for(Map.Entry<Character,Integer> element: map.entrySet())
{
if(element.getValue()>1)
{
System.out.println(element.getKey()+" "+element.getValue());
}
}
}


//*******************************************************************//
public static void reverseString(String str)
{
int len = str.length();

for(int i=len-1; i>=0; i--)
{
System.out.print(str.charAt(i));
}
}

//*****************************************************************//
public static void reverseScentence(String str)
{
String[] words = str.split("\\s+");
int len = words.length;
StringBuilder reversedString = new StringBuilder();
for(int i=len-1; i>=0; i--)
{
reversedString.append(words[i]);
if(i>0)
{
reversedString.append(" ");
}
}
System.out.println(reversedString.toString());
}


//*************************************************************//
public static void reverseEachword(String str)
{
String[] words = str.split("\\s+");

for (String word: words)
{
for(int i=word.length()-1; i>=0; i--)
{
System.out.print(word.charAt(i));
}
System.out.print(" ");
}
}


public static void findDuplicates()
{
int[] num = {1,2,4,5,5,5,6,8,3,1,0,4,0};
HashMap<Integer,Integer> numset = new HashMap<>();
int len = num.length;
for(int no: num)
{
if(numset.containsKey(no))
{
numset.put(no, numset.get(no)+1);
}
else
{
numset.put(no,1);
}
}
for(Map.Entry<Integer, Integer> e: numset.entrySet())
{
if(e.getValue()>1)
{
System.out.println(e.getKey()+" is a duplicate");
}
}
}



//***************************************************************//
public static void removeDuplicatesFromArray()
{
Integer[] num = {1,2,2,5,4,3,3,8,0};
String[] names = {"vivek", "vivek", "sonal", "piyush"};
HashSet<String> numSet = new HashSet<>(Arrays.asList(names));
for(String n: numSet)
{
System.out.print(n+" ");
}
}


//**************************************************************//
public static void sumofSubArray()
{
int[] num = {1,2,3,2,-1,6,7,-2,0};
int len = num.length;
int k=5;
int count=0;

for(int start=0; start<len; start++)
{
int sum = 0;
for(int end=start; end<len; end++)
{
sum = sum+num[end];
if(sum==k)
{
  for(int i=start; i<=end;i++)
   {
  System.out.print(num[i]);
   }
count++;
}
}
}
System.out.println(count);
}



//*************************************************************//

public static void maximumSumSubArray() {
int[] num = {-1,0,2,-6,5,-3,2,-10};
int len = num.length;
int maxsum = 0;
for(int start=0; start<len; start++) {
int currentsum = 0;
for(int end=start; end<len; end++) {
currentsum=currentsum+num[end];
if(currentsum>maxsum)
{
maxsum=currentsum;
}
}
}

System.out.println(maxsum);
}



//*************************************************************//
public static void maximumSumofSubArray()
{
int[] num = {-1,0,2,-6,5,-3,2,-10};
int len = num.length;
int maxsum = 0;
int currentsum = 0;
for(int i=0; i<len; i++)
{
currentsum = currentsum+num[i];

if(currentsum>maxsum)
{
maxsum=currentsum;
}
if(currentsum<0)
{
currentsum=0;
}
}
System.out.println(maxsum);
}


//************************************************************//
public static void maxProfit()
{
int[] rate = {5,3,2,8,1,4,10,9};
int minrate = rate[0];
int maxprofit = 0;
int len = rate.length;

for(int i=0; i<len; i++)
{
if(rate[i]<minrate)
{
minrate= rate[i];
}
int profit = rate[i]-minrate;
if(profit>maxprofit)
{
maxprofit= profit;
}
}
System.out.println(maxprofit);
}

public static void subStringMethod() {

String str = "Vivek Verma";

String sub = str.substring(3,9);

System.out.println(sub);
}



//************************************************************//
public static void consecutiveOccuranceofNumber()
{
int[] num = {1,2,5,4,8,5,5,5,5,6,7,1,0};
int len = num.length;
int max=0;
int count=0;

for(int i=0;i<len-1;i++)
{
if(num[i]==num[i+1])
{
count++;
}
else
{
count=0;
}

max = Math.max(max, count+1);
}

System.out.println(max);

}

//***********************************************************//
public static void printUniqueChar() {

String s = "good";
char[] ch = s.toCharArray();
HashMap<Character,Integer> map = new HashMap<>();
for(char c: ch)
{
if(map.containsKey(c))
{
map.put(c, map.get(c)+1);
}
else
{
map.put(c, 1);
}
}

for(Map.Entry<Character,Integer> element: map.entrySet())
{
if (element.getValue()==1)
System.out.print(element.getKey());
}

}


//*************************************************************//
public static String convertAlternateCase(String input) {
    StringBuilder output = new StringBuilder();
    boolean toLowerCase = true;

    for (char c : input.toCharArray()) {
        if (toLowerCase) {
            output.append(Character.toLowerCase(c));
        } else {
            output.append(Character.toUpperCase(c));
        }
        toLowerCase = !toLowerCase; // Toggle the case for next character
    }

    return output.toString();
}

//*************************************************************//
public static void main(String[] args) {

// InterviewQuestions.allZerosToRight();
// InterviewQuestions.allZerosToLeft();
// InterviewQuestions.charCount("aabbbbccd");
// InterviewQuestions.duplicateChar("vivek verma");
// InterviewQuestions.reverseString("Vivek Verma");
// InterviewQuestions.reverseScentence("Hello Java! This is a test.");
// InterviewQuestions.reverseEachword("Vivek Verma");
// InterviewQuestions.findDuplicates();
// InterviewQuestions.removeDuplicatesFromArray();
// InterviewQuestions.sumofSubArray();
// InterviewQuestions.maximumSumofSubArray();
// InterviewQuestions.maxProfit();
// InterviewQuestions.maximumSumSubArray();
// InterviewQuestions.subStringMethod();
// InterviewQuestions.swapString();
// InterviewQuestions.fibonacci(8);
// InterviewQuestions.sumofDigits(123);
// InterviewQuestions.reversetheNumber(45823);
// InterviewQuestions.isNumberPrime(13);
// InterviewQuestions.consecutiveOccuranceofNumber();
// InterviewQuestions.printUniqueChar();
// System.out.println(InterviewQuestions.test(13));
//InterviewQuestions.convertAlternateCase("aAbBcCdD");


}

}