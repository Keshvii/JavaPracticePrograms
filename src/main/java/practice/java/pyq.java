/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practice.java;
import java.util.*;

public class pyq {
    
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int maxInput = Math.max(a, b);
        
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        int fibNumber = fib(i);
        while(fibNumber <= maxInput){
            if(fibNumber >= a && fibNumber <= b){
                arr.add(fibNumber);
            }
            i++;
            fibNumber = fib(i);
        }
        
        if(arr.isEmpty()){
            System.out.println("No Fibonacci number found in the given range.");
        } else {
            System.out.println("Largest Fibonacci number in the given range: " + arr.get(arr.size() - 1));
        }
    }
}



//
//package ques1.practice;
//import java.util.*;
//public class pyq {
//    
//    public static int fib(int n){
//        if(n<=1){
//            return n;
//        }
//        return fib(n-1)+fib(n-2);
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        
//        int c = (a>b)?a:b;
//        List<Integer> arr = new ArrayList<>();
//        for(int i=0; i<c ; i++){
//            int f = fib(i);
//            if(f<a){
//                continue;
//            }
//            if(f<a && f>b){
//               arr.add(f);
//            }
//            else{
//                break;
//            }
//        }
//        
//        System.out.println("largest : "+ arr.get(arr.size()-1));
//    }
//    
//}
