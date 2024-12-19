/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java.FileHandling;
import java.io.*;

public class FileByteStreamInputOutput {
    public static void main(String[] args) {
        
        try
            (FileOutputStream fos = new FileOutputStream("D:\\MainDirectory\\txt\\hhh.txt",true)){
            byte[] b = ("\n").getBytes();
            
            fos.write(b);

            
            
            FileInputStream fis = new FileInputStream("D:\\MainDirectory\\txt\\hhh.txt");
            byte[] b1 = fis.readAllBytes(); 
            //fis.read(b1,2 , 4);
            String s = new String(b1);
            System.out.println(s);
            
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
}
