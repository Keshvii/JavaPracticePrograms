/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaSess1Questions;
import java.util.*;
class Prime{
    private int d;
    
    public Prime (int n){
        this.d = highestPrime(n);
    }
    
    public int getD(){
        return d;
    }
    
    public int highestPrime(int n){
        List<Integer> p = new ArrayList<>();
        int count=0;
        for(int j=2 ; j<n; j++){
            boolean isprime = true;
            for(int i=2;i<Math.sqrt(j);i++){
                if(j%i==0){
                    isprime = false;
                    break;
                }
            
            }
            if(isprime){
                p.add(j);
                count++;
            }
        }
        
        return p.get(count-1);
    }

}
public class Q1 {

    public static void main(String[] args) {
        Prime p = new Prime(20);
        System.out.println("Highest prime : "+p.getD());
    }
    
}
