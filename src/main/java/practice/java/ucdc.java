/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;


class dog{
    void sound(){
        System.out.println("Barks");
    }
    void foo(){
        System.out.println("Foo in dog");
    }
}
class puppy extends dog{
    @Override
    void sound(){
        System.out.println("Whines");
    }
    void foo1(){System.out.println("Foo1 in dog");}
    
}
public class ucdc {

    public static void main(String[] args) {
        // TODO code application logic here
        dog d = new dog();
        d.foo();
        d.sound();
        
    }
    
}
