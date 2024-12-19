/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

public class Excep {
    
    public static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        
        try{
             System.out.println("kkkkkkkk");
             divide(2,0);
             System.out.println("HAHAHAAH");
        }catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }finally{
        }

    }
//    public static void main(String[] args) {
//        try {
//            int result = divide(10, 0);
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static int divide(int a, int b)throws ArithmeticException {
//        if (b == 0) {
//            throw new ArithmeticException("Division by zero");
//        }
//        return a / b;
//    }
    
}
