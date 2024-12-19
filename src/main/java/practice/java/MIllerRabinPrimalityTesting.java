/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;
import java.util.*;

public class MIllerRabinPrimalityTesting {

    // Miller-Rabin primality test
    public static void isPrime(int n, int k) {
        Random rand = new Random();
        boolean isprime = true;
        for(int i=1; i<=k; i++){
            int a = 2 + rand.nextInt(n-3);
            double result = Math.pow(a,n-1)%n;
            if(result != 1.0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println(n+ " is prime");
        }else{
            System.out.println(n+ " is not prime");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt(); // Number of iterations

        isPrime(n, k);
            
    }
    
}
