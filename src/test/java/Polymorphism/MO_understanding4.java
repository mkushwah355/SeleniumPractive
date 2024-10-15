package Polymorphism;

interface BaseClass3 {

	 public void m1();
}
//Cannot give interface reference type without implementing interface.
class MO_understanding4 implements BaseClass3{
	 
		public void m1() {
				System.out.println("ChildClass m1() method"); 			
			}

		public static void main(String[] arg) {
			BaseClass3 s1 = new MO_understanding4();
			s1.m1();
		}
	}


