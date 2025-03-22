package Java_Concepts;

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cats meow");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Dog();  // Runtime object is Dog
        myAnimal.sound();      // Output: Dogs bark
        
        myAnimal = new Cat();  // Runtime object is Cat
        myAnimal.sound();      // Output: Cats meow
    }
}
