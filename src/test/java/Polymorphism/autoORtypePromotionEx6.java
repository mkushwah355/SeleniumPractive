package Polymorphism;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class autoORtypePromotionEx6 {
	
	 void method(int a, int b)  throws Exception{
		System.out.println("Method1");
	}
	
	 void method(String a, int b) throws SQLException {
		System.out.println("Method2");
	}

	public static void main (String []arg) throws Exception {
		
		autoORtypePromotionEx6 s= new autoORtypePromotionEx6();
		s.method(1, 2);
	}
}
