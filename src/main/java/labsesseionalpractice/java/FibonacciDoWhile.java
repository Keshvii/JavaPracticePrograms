/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;

public class FibonacciDoWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;//number of terms
        int prev = 0, curr = 1;


        int count=1;
        do{
            System.out.println(prev);
            int next = prev+curr;
            prev = curr;
            curr = next;
            count++;
        }while(count<=n);
        
    }
    
}
