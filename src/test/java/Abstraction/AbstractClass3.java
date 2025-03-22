package Abstraction;

interface Animal4 {
    default  void sound() {
        System.out.println("Animals make sounds");
    }
}
abstract class Dog4 implements Animal4 {
    @Override
   public void sound() {
        System.out.println("Dogs bark");
    }
}
class Cat extends Dog4 {
    @Override
   public void sound() {
        System.out.println("Cats meow");
    }
    
    public void soundReturn() {//helper method to call dog abstract class sound method.
    	super.sound();
        System.out.println("Cats meow");
    }    
}
public class AbstractClass3 {
    public static void main(String[] args) {
       
    	Cat s1= new Cat();
    	s1.soundReturn();
    }
}
