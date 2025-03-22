package Java_Concepts;
class Parent {
    static void staticMethod() {
        System.out.println("Parent's static method");
    }
    
    final void finalMethod() {
        System.out.println("Parent's final method");
    }
    
    private void privateMethod() {
        System.out.println("Parent's private method");
    }
    
    String field = "Parent's field";
}
class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child's static method");
    }
    
    // finalMethod cannot be overridden because it is final
    
    private void privateMethod() {
        System.out.println("Child's private method");
    }
    
    String field = "Child's field";
}
public class StaticBinding {
    public static void main(String[] args) {
        Parent parent = new Child();
        
        // Static binding examples:
        parent.staticMethod();          // Output: Parent's static method
        parent.finalMethod();           // Output: Parent's final method
        // The following line won't compile because private methods are not inherited
        // parent.privateMethod();
        
        System.out.println(parent.field);  // Output: Parent's field
    }
}
