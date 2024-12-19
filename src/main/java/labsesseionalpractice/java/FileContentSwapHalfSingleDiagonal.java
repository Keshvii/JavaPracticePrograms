package labsesseionalpractice.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileContentSwapHalfSingleDiagonal {
    public static void main(String[] args) {
        try{
            FileInputStream fis1 = new FileInputStream("SwapF1.txt");
       
            byte[] b1 = fis1.readAllBytes();
            System.out.println(b1.length);
            System.out.println(b1);
            System.out.println(Arrays.toString(b1));
            fis1.close();
            FileInputStream fis2 = new FileInputStream("SwapF2.txt");
            byte[] b2 = fis2.readAllBytes();
            System.out.println(b2.length);
            System.out.println(Arrays.toString(b2));
            fis2.close();

            FileOutputStream fos1 = new FileOutputStream("SwapF1.txt");
            fos1.write(b2,(b2.length)/2, (b2.length+1)/2);
            fos1.write(b1, (b1.length)/2, (b1.length+1)/2);// in case of odd number of bytes second half will have
            fos1.close();

            FileOutputStream fos2 = new FileOutputStream("SwapF2.txt");
            fos2.write(b2,0, (b2.length)/2);
            fos2.write(b1, 0, (b1.length)/2);
            fos2.close();


        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
/*
13 is the carriage return character (CR)\r,
10 is the line feed character (LF)\n,
in byte array (ascii values)
Carriage Return (CR): In ASCII, the CR character has the decimal value 13 (hexadecimal value 0x0D). Historically, a carriage return instructs a printer or terminal to return the carriage (the printing mechanism) to the leftmost position on the current line. In text files, a CR character typically indicates the end of a line.

Line Feed (LF): In ASCII, the LF character has the decimal value 10 (hexadecimal value 0x0A). A line feed moves the printing position one line down but keeps the horizontal position unchanged. In text files, an LF character usually denotes the start of a new line.

Together, CR and LF characters are commonly used in combination as a newline sequence in text files. This combination represents a complete line break, with the CR character indicating the end of the current line and the LF character indicating the start of the next line. This convention is known as "CRLF" (Carriage Return Line Feed) and is widely used in various operating systems and file formats.
*/