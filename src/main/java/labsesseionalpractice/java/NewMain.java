/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;
import java.util.Scanner;
public class NewMain {

    static int gcdcalcrecurr(int a, int b){
        if(b==0){
            return a;
        }
        return gcdcalcrecurr(b,a%b);
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner (System.in);
        //String s = sc.nextLine();

        //fibonacci
        int n = 5; //number of terms
        int a = 0, b = 1;
        for(int i=1; i<=5; i++){
            System.out.println(a);
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(gcdcalcrecurr(18,24));

    }
    
}
/*
W3Q3
        double sum=0;
        for(double d=1;d<=10; d++){
            sum += 1/d;
        }
        System.out.println("Sum = "+sum);
*/