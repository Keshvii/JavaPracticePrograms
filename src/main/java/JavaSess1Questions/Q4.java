/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaSess1Questions;
import java.io.*;

interface userinterface{
    void foo();
    void func1();
    default void func2(){
        System.out.println("Def func2 in interface");
        throw new RuntimeException("Dummy");
    }
    static void func3(){
        System.out.println("Static func3 in interface");
    }
}

class test implements userinterface{
    @Override
    public void foo(){System.out.println("foo in test class");}
    @Override
    public void func1(){System.out.println("func1 in test class");}
}

public class Q4 {
    
    public static void main(String[] args) {
        test t = new test();
        t.foo();
        t.func2();
        //throw new IOException("Dummy");// need to be catched or handeled esle shows error
    }
    
}
