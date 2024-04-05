/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ques1.practice;
import java.util.*;
public class StringSentenceSort {
    public static void main(String[] args) {
        String input = "I am living in Aligarh. Aligarh Muslim University is situated in Aligarh. Aligarh is also famous for Lock industry.";

        String[] sentences = input.split("[.]"); 
        
  
        //Arrays.sort(sentences, Comparator.comparing(String::toLowerCase)); 
        // Step 1: Define a Comparator for comparing strings case-insensitively
Comparator<String> comparator = Comparator.comparing(String::toLowerCase);

// Step 2: Sort the array 'sentences' using the defined Comparator
Arrays.sort(sentences, comparator);
        for(String s: sentences){
            System.out.print(s + ".");
        }
    }
}
