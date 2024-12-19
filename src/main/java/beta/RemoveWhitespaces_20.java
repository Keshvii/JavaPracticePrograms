package beta;

import java.util.TreeMap;

public class RemoveWhitespaces_20 {

    static String removeWhitespace(String s){
        String st="";
        for(char c: s.toCharArray()){
            if(c!=' '){
                st += Character.toString(c);
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String s = "Reverse each word of a string";
        System.out.println(removeWhitespace(s));
    }
}
