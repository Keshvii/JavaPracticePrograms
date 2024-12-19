/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;
import java.util.*;
/**
 *
 * @author keshv
 */
public class charnumdiffarr {

    
    public static void main(String[] args) {
        String s = "My date of birth is 23October 1998";
        char[] chararr = s.toCharArray();
        //48,57
        List<Character> Ch_arr = new ArrayList<>();
        List<Integer> Num_arr = new ArrayList<>();
        
        for(char c: chararr){
            if(((int)c)>=48&&((int)c)<=57){
                int n = (int)c;
                Num_arr.add(n);
            }else{
                if(((int)c)!=32){
                    Ch_arr.add(c);
                }
            }
        }
        
        System.out.println("Char array: ");
        System.out.println(Ch_arr);
        System.out.println("\nInt array: ");
        System.out.println(Num_arr);
        
        
    }
    
}
