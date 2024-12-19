/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void func(){
        System.out.println("func in animal");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}


public class NewMain1 {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Upcasting Dog to Animal
        animal.sound(); // Polymorphic call: calls Dog's overridden method
        // animal.wagTail(); // This line would cause a compile-time error
        animal.func();

        
        // Downcasting
       
            Dog dog = (Dog) animal; // Downcasting Animal to Dog
            dog.wagTail(); // Accessing Dog-specific method after downcasting
            dog.sound();
            dog.func();
            
        
    }
    
}


