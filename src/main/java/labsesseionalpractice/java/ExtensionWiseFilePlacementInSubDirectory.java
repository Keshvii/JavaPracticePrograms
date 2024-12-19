/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;
import java.io.*;
public class ExtensionWiseFilePlacementInSubDirectory {

    public static void main(String[] args) {
      File mainDir = new File("D:\\MainDirectory");
        mainDir.mkdir();
        File f1 = new File(mainDir,"f1.txt");
        File f2 = new File(mainDir,"f2.java");
        File f3 = new File(mainDir,"f3.pdf");
        File f4 = new File(mainDir,"f4.py");
        File f5 = new File(mainDir,"f5.dox");
        File f6 = new File(mainDir,"f6.ppt");
        File f7 = new File(mainDir,"f7.txt");
        
        try{
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
            f4.createNewFile();
            f5.createNewFile();
            f6.createNewFile();
            f7.createNewFile();
            
//            System.out.println(f1.getParentFile());
//            System.out.println(f1.getParent());
//            System.out.println(f1.getName());
//            System.out.println(mainDir.getParentFile());
//            System.out.println(mainDir.getParent());
//            System.out.println(mainDir.getName());
//            System.out.println("Files created");
            
            File[] lf = mainDir.listFiles();
            
            for(File f: lf){
                
                String[] fn = f.getName().split("\\.");
                
                File subDir = new File(mainDir+"\\"+fn[1]);
                subDir.mkdir();
//                if(!subDir.exists()){
//                    subDir.mkdir();
//                    f.renameTo(new File(subDir,f.getName()));
//                }else{
//                    f.renameTo(new File(subDir,f.getName()));
//                }

                f.renameTo(new File(subDir,f.getName()));
            
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
