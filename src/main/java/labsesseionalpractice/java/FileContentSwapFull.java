package labsesseionalpractice.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileContentSwapFull {
    public static void main(String[] args) {
        try{
            FileInputStream fis1 = new FileInputStream("SwapF1.txt");
            byte[] b1 = fis1.readAllBytes();
            fis1.close();
            FileInputStream fis2 = new FileInputStream("SwapF2.txt");
            byte[] b2 = fis2.readAllBytes();
            fis2.close();

            FileOutputStream fos1 = new FileOutputStream("SwapF2.txt");
            fos1.write(b1);
            fos1.close();

            FileOutputStream fos2 = new FileOutputStream("SwapF1.txt");
            fos2.write(b2);
            fos2.close();
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
