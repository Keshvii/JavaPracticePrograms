package beta;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MiddleWordFromGivenSentence_14 {
    static String middleWord(String s){
        StringTokenizer st = new StringTokenizer(s," ");
        ArrayList<String> al = new ArrayList<>();
        while (st.hasMoreTokens()){
            al.add(st.nextToken());
        }
        System.out.println(al);
        int n = al.size()/2;
        return al.get(n);
    }

    public static void main(String[] args) {
        String s = "This ij is a java code.";
        System.out.println(middleWord(s));

    }

}
