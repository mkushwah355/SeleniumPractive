package Constructors;
//We can pass values from the child class constructor to the parent class constructor using the super() call. 
//This is particularly useful when the parent class has a parameterized constructor and you want to provide specific values from the child class.

class Parent {
    Parent(String name) { // Parameterized constructor in Parent
        System.out.println("Parent's name is: " + name);
    }
}

class Child extends Parent {
    Child(String childName, String parentName) {
        super(parentName); // Passes parentName to the Parent constructor
        System.out.println("Child's name is: " + childName);
    }
}

class SuperCall {
    public static void main(String[] args) {
        Child child = new Child("Alice", "Bob");
    }
}
