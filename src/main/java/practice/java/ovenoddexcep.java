/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;
import java.util.Scanner;
class OandE{
    private int co,ce;
    public void addNum(int n){
        if(n%2==0)
            ce++;
        else
            co++;
    }
    
    @Override
    public String toString(){
        return "Number of odd = "+co+"---Number of even = "+ce;
    }
}


public class ovenoddexcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OandE oe = new OandE();
        while(true){
            System.out.println("Enter num or q to exit: ");
            String s = sc.nextLine();
            try{
                int k = Integer.parseInt(s);
                oe.addNum(k);
            }catch(NumberFormatException e){
                if(s.equalsIgnoreCase("q")){
                    break;
                }else{
                    System.out.println("Invalid output! RE-ENTER");
                }
            }
            
        }
        System.out.println(oe.toString());
    }
    
}
