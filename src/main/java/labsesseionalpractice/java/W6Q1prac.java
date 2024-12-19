/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DataProcessor{

    public List<Double> readValuesFromFile(String filePath) {
        List<Double> values = new ArrayList<>();
        try{
            System.out.println("Reading the file : "+filePath);
            BufferedReader r = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = r.readLine())!=null){
                System.out.println(line);
                try{
                    double k = Double.parseDouble(line);
                    values.add(k);
                }catch(NumberFormatException e){
                    System.out.println(line +" Cannot be converted to number : " + e);
                }
                
            }
            System.out.println("Finished!");
            r.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        return values;
    }
    
    public List<Double> validateData(List<Double> values) throws InvalidDataException {
        for(Double d: values){
            if( d == null || d.isNaN() || d.isInfinite() ){
                throw new InvalidDataException("Invalid DataType! "+d);
            }
        }
        return values;
    }
    
    public double calculateAverage(List<Double> validValues){
        double sum=0;
        for(Double d: validValues){
            sum += d;
        }
        return sum/validValues.size();
    }
    
    public void writeResultToFile(double average, String outputPath){
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter(outputPath));
            w.write("Average : "+average);
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void writeCreateFile(String filePath){
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter(filePath));
            System.out.println("Enter inputs: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            while(!s.equalsIgnoreCase("exit")){
                w.write(s);
                w.newLine();
                s = sc.nextLine();
            }
            System.out.println("File Created");
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}

class InvalidDataException extends Exception{
    public InvalidDataException(String msg){
        super(msg);
    }
    
}

public class W6Q1prac {

    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();
        //Write In FILE
        dp.writeCreateFile("input.txt");
        try{
            List<Double> values = dp.readValuesFromFile("input.txt");
            List<Double> validValues = dp.validateData(values);
            double avg = dp.calculateAverage(validValues);
            dp.writeResultToFile(avg, "output.txt");
            BufferedReader r = new BufferedReader(new FileReader("output.txt"));
            System.out.println(r.readLine()); 
            
        }catch(InvalidDataException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
