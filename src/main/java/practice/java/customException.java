/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class MyCustomException extends Exception{

    public MyCustomException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "My custom exception";
    }
//    @Override
//    public String getMessage() {
//        return "My custom exception";
//    }
    
}


public class customException {
    public static void main(String[] args) throws MyCustomException{
        try{
            throw new MyCustomException("ERROR!!!");
        }catch(MyCustomException e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    
}
