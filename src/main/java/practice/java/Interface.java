/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

interface Intrface{
    int FI=89; // final , static, public
    
    void func1(int n); //abstract, public
    
    default void deffunction(){
        System.out.println("This is def");
    } 
    
    static void staticfunc(){
        System.out.println("Static func");
    }
    

} 

//interface I1{
//    void i1();
//}
//interface I2 extends I4{
//    void i2();
//}
//interface I3{
//    void i3();
//}
//interface I4{
//    void i4();
//}
//
//class Khatarnaak extends neww2 implements I1,I2,I3,I4{
//
//    @Override
//    public void i1() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void i2() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void i3() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void i4() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    
//}



//interface Interface1 {
//    void method1();
//}
//
//interface Interface2 extends Interface1 {
//    void method2();
//}
//
//class MyClass implements Interface2 {
//    @Override
//    public void method1() {
//        System.out.println("Method 1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("Method 2");
//    }
//}
//MyClass obj = new MyClass();
//        obj.method1();
//        obj.method2();









abstract class neww implements Intrface{
    @Override
    public abstract void func1(int n); //impleming class : use public in overriden methods
    @Override
    public void deffunction(){
        System.out.println("This is def in class neww");
    }
    public void newwfunc(){
        System.out.println("newwfunc");
    }
    static void staticfunc(){
        System.out.println("Static func in abs");
    }
 
}

class neww2 extends neww{
    @Override
    public void func1(int n){
        System.out.println("jhjkdshk");
    }
    public void f(){
        System.out.println("f");
    }
}

//interface IA{
//    void funcIA();
//}
//class A {
//    
//    public void funcA(){
//        System.out.println("funcIA in IA");
//    }
//}

public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        neww2 n = new neww2();
        n.deffunction();
        n.newwfunc();
//        Intrface.staticfunc();
//        System.out.println(Intrface.FI);
//        neww.staticfunc();
        

// Intrface i = new A(); error only implementing class can be referenced by the interface
        Intrface i = new neww2();
        i.func1(4);
        i.deffunction();
       // i.f();// call all interface method and commonmethod in i and implementing class
        ((neww2) i).newwfunc();
    } 
}
