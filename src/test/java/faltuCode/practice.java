package faltuCode;
interface Animal {
    default  void sound() {
        System.out.println("Animals make sounds");
    }
}
abstract class Dog implements Animal {
    @Override
   public void sound() {
        System.out.println("Dogs bark");
    }
}
class Cat extends Dog {
    @Override
   public void sound() {
        System.out.println("Cats meow");
    }
    
    public void soundReturn() {//helper method to call dog abstract class sound method.
    	super.sound();
        System.out.println("Cats meow");
    }    
}
public class practice {
    public static void main(String[] args) {
       
    	Cat s1= new Cat();
    	s1.soundReturn();
    }
}
