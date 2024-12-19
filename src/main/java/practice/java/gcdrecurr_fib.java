/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;
import java.util.Scanner;

public class gcdrecurr_fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n = sc.nextInt();
        
        int[][] twoDim = new int[n][];
        int count=0;
        for(int i=0; i<n; i++){
            twoDim[i] = new int[i+1];
            for(int j=0; j<i; j++){
                twoDim[i][j] = count;
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    
}
