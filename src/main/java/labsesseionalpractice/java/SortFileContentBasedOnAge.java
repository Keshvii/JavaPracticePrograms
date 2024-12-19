package labsesseionalpractice.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortFileContentBasedOnAge {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("SortFileContentBasedOnAge.txt"));
            String line = null;
            HashMap<String, Integer> records = new HashMap<>();
            while(br.readLine()!=null){
                String[] str = line.split(" ");
                int k = Integer.parseInt(str[2]);
                records.put(str[0]+str[1],k);
            }

        }catch(NumberFormatException e){
            System.out.println("Parsing not Error! : "+e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error! : "+e.getMessage());
        }
    }
    //bubble sort

}
