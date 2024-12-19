/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaSess1Questions;
import java.util.Scanner;
class SingleDigitException extends Exception{
    public SingleDigitException(String msg){
        super(msg);
    }
    @Override
    public String toString(){
        return "Sing digit number entered!";
    }
}


public class Q2 {
    
    public static boolean isSingle(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        if(count >=2){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws SingleDigitException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 digit number");
            int n = sc.nextInt();
            if(isSingle(n)){
                throw new SingleDigitException("Single digit number found");
            }
            
        }
        catch(SingleDigitException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        
    }
    
}
