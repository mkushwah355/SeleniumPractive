package Java_Programs;

//Aim: Swap numbers(i.e. 1122 to 2211) 
class Int_5SwapIntNumber{
	public static void main(String[] args) {
		
		int a = 1122;
		
		
		int x= a%100;//22
		int y= a/100;//11
		
		a= (x*100) + y;
		System.out.println(a);
		
	}
}