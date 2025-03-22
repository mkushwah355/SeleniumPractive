package Abstraction;

public class AssignmentOperator {  
    public static void main(String[] args) {  
        int x = 10;  
           
        // Addition assignment operator  
        x += 10;  
        System.out.println("Addition assignment operator= " +x);  
          
        // Subtraction assignment operator  
        x -= 3;  
        System.out.println("Subtraction assignment operator= " +x);  
          
        // Multiplication assignment operator  
        x *= 2;  
        System.out.println("Multiplication assignment operator= " +x);  
          
        // Division assignment operator  
         x /= 4;  
        System.out.println("Division assignment operator= " +x);  
          
        // Modulus assignment operator  
        x %= 3;  
        System.out.println("Modulus assignment operator=  " +x);  
          
        // Left shift assignment operator  
        x <<= 2;  
        System.out.println("Left shift assignment operator= "+x);  
          
        // Right shift assignment operator  
        x >>= 1;  
        System.out.println("Right shift assignment operator= " +x);  
          
        // Bitwise AND assignment operator  
        x &= 5;  
        System.out.println("Bitwise AND assignment operator= " +x);  
          
        // Bitwise OR assignment operator  
        x |= 2;  
        System.out.println("Bitwise OR assignment operator= "+x);  
          
        // Bitwise XOR assignment operator  
        x ^= 1;  
        System.out.println("Bitwise XOR assignment operator= "+x);  
    }  
}  
