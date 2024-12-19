/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class Abc{
    private int a,b,c;

    public Abc() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
    
    public Abc(int a) {
        this(a,6,0); //constructor chaining 
        
    }
    
    public Abc(int a, int b) {
        this(); // constructor chaining
        this.a = a;
        this.b = b;
    }
    
    public Abc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    

    

}


public class ConstructorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
