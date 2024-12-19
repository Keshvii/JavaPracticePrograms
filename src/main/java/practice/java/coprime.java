/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

public class coprime {
    
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public static int gcd1(int a, int b){
    
        while(a%b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return b;
    
    }
    public static void main(String[] args) {
        int userinp = 47;
        for(int i=1; i<userinp; i++){
            if(gcd(i,userinp)==1){
                System.out.println(i);
            }
        }
//System.out.println(gcd1(12,18));
//        System.out.println(gcd(12,18));
    }
    
}
