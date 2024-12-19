package algo_based_questions;

import java.util.ArrayList;

public class CharInWord {

    public static ArrayList<Integer> indexOfChar(String s, char c){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(c==s.charAt(i)){
                ar.add(i);
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        String s = "ajhsadvbjicab";
        char c = 'a';
        System.out.println("Index: " + indexOfChar(s,c) );
    }
}
