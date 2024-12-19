/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

interface i3{
    int NUM = 34;
    void fun();
}
class k implements i3{
    
    String NUM = "kjk";
    @Override
    public void fun() {
        System.out.println("hghj");
    }
    
}
public class Operators {
    public static void main(String[] args) {
        // Arithmetic Ascii value (A-Z: 65-90)(a-z:97-122)
        char a1 = 'z';
        System.out.println((a1-90));
        
        //Bitwise
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b)|(a & ~b);
        int g = ~a & 0x0f; //0x hexadecimal
        System.out.println("c = "+c+ "\nd = "+d+ "\ne = "+e+ "\nf = "+f+ "\ng = "+g);
        
        //Left shift
        System.out.println("-21<<1 = "+ (-21<<1));
        //Right shift
        System.out.println("20>>3 = "+(20>>3));
        System.out.println("-20>>3 = "+(-20>>1));
        System.out.println("-21>>1 = "+(-21>>2));
        //unsigned right shift
        System.out.println("-20>>>30 = "+(-20>>>30));
        
//        System.out.println(i3.NUM);
//        k KK = new k();
//        System.out.println(KK.NUM);
                
    }
    
}
