package Java8Features;

/*class MyRunnable implements Runnable{
	
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Child Thread");
		}
	}	
}*/
public class lambdaFunction_multiThreading {
		public static void main (String []arg) {
		//	MyRunnable s1= new MyRunnable();
			Runnable s1= ()->{
				for(int i=0; i<10;i++) {
					System.out.println("Child Thread");
				}
			};			
			Thread t1= new Thread(s1);
			t1.start();
			for(int i=0; i<10;i++) {
				System.out.println("Main thread");
			}}
}
