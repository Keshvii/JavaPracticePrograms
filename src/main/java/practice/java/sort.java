/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

import java.util.Arrays;

/**
 *
 * @author keshv
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr = {2,3,4,1};




        try{
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
        
        for(int a:arr){
            System.out.print(a + " ");
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
