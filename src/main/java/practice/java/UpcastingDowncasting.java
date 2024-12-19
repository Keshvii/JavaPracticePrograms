/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class d{
    void sound(){
        System.out.println("Barks");
    }
    void foo(){
        System.out.println("Foo in dog");
    }
}
class p extends d{
    @Override
    void sound(){
        System.out.println("Whines");
    }
    void foo1(){
        System.out.println("Foo1 in puppy");
    }
    
}

public class UpcastingDowncasting {

    public static void main(String[] args) {
        d d1 = new p();//upcasting
        d1.sound();
        d1.foo();
        ((d)d1).sound();// already type d 
        //d1.foo1();
        
//      // Downcasting
        if (d1 instanceof p) {
            p pup = (p) d1; // Downcasting Animal to Dog
            pup.foo1(); //Accessing Dog-specific method after downcasting
            pup.sound();
            pup.foo();
        }
        
    }
    
}

/*
DYNAMIC METHOD DISPATCH 
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog(); // Upcasting
        animal1.sound(); // Dynamic method dispatch: calls Dog's sound() method
        animal = new Cat(); // Upcasting
        animal2.sound(); // Dynamic method dispatch: calls Cat's sound() method
    }
}


*/