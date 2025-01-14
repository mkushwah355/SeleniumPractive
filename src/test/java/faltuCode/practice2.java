package faltuCode;

import java.io.*;
 class practice2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    
    practice2(int id, String name){
    	this.id=id;
    	this.name=name;
    }
    
// Constructor, getters, and setters

    public static void main(String[] args) {

// Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("practice2.ser"))) {
            practice2 practice = new practice2(1, "Test");
            out.writeObject(practice);
        } catch (IOException e) {
            e.printStackTrace();
        }

// De-serialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("practice2.ser"))) {
            practice2 practice2 = (practice2) in.readObject();
            System.out.println(practice2.getClass());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
