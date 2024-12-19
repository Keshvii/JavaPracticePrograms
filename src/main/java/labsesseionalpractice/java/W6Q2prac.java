/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;

import java.io.*;

/**
 *
 * @author keshv
 */
public class W6Q2prac {

    public static int countExc(String filepath){
        int count=0;
        try{
            BufferedReader r = new BufferedReader(new FileReader(filepath));
            String line;
            while((line =r.readLine())!=null ){
                if(line.contains("throws")||line.contains("throw")||line.contains("catch")){
                    count++;
                }
            }
        
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(countExc("F:\\java\\week6\\exception.java"));
    }
    
}
