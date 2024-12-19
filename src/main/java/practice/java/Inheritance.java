/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class Parent{
    private int i,j;
    
    public Parent(int i, int j){
        this.i = i;
        this.j = j;
    }
    
    public void foo(){
        System.out.println("foo in Parent");
    }
    
    public void foo1(){
        System.out.println("foo1 in Parent");
    }
}

class Child extends Parent{
    private int k;
    
    public Child(int i, int j, int k){
        super(i,j);
        this.k = k;
    }
    
    @Override
    public void foo(){
        System.out.println("foo in Child");
        super.foo1();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child(2,3,4);
        c.foo();
        
    }
    
}
