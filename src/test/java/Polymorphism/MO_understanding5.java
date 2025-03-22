package Polymorphism;

class Parent {
    static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
   static  void staticMethod() {
        System.out.println("Child static method");
    }
}

public class MO_understanding5 {
    public static void main(String[] args) {
    	Parent.staticMethod(); // Calls Parent's static method
    	Child.staticMethod();  // Calls Child static method
    } 
}

