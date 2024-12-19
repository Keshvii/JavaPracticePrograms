/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java.FileHandling;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class FileDirectoryCreate {

    public static void main(String[] args) {
//        File f = new File("D:\\JavaFolderForPractice");
//        f.mkdir();
//        System.out.println("Dir ready");
//        f.delete();
//        System.out.println("delete dir");
//        File f1 = new File("D:\\JavaFolderForPractice","txt1.txt");
//        try {
//        f1.createNewFile();
//            System.out.println("created");
//        }catch (IOException e){
//            System.out.println("file exist");
//        }
        File myFile = new File("D:\\JavaFolderForPractice\\myfile.txt");

        try {
          if (myFile.createNewFile()) {
            System.out.println("File created successfully!");
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("Error creating file: " + e.getMessage());
        }       
        
        
        //f1.delete();
  

//        //Autocloseable Interface
//        try(FileReader fr= new FileReader("D:\\JavaFolderForPractice\\txt1.txt");
//            BufferedReader bf= new BufferedReader(fr);
//            ){
//            
//            System.out.println(bf.readLine());
//            
//        }catch(IOException e){
//            System.out.println(e);
//        }
//        finally{
//            fr.close();
//            bf.close();;
//        }
        
        

//        try(FileOutputStream fi = new FileOutputStream("FileOutStr.txt")){
//            String str1 = "AMU\n";
//            byte[] b1 = str1.getBytes();
//            fi.write(b1);
//            String str2 = "AMU\n";
//            byte[] b2 = str2.getBytes();
//            fi.write(b2);
//            String str3 = "AMU\n";
//            byte[] b3 = str3.getBytes();
//            fi.write(b3);
//        }catch(IOException e){
//            System.out.println("Error during write: " + e.getMessage());
//        }
//        try(FileInputStream fo = new FileInputStream("C:\\Users\\keshv\\OneDrive\\My\\Java\\FileOutStr.txt")){
//            byte[] o = fo.readAllBytes();
//            String s = new String(o);
//            System.out.println(s);
//        }catch(IOException e){
//            System.out.println("error during read: "+e.getMessage());
//        }

    }
    
}
