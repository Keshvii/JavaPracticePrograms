package practice.java.Strings;

public class Occurence_of_word_in_a_string {

    static int counting(String s, String w) {
        int count=0;
        int i=0,j=w.length();
        while(s.charAt(i)!=w.charAt(i)&&j<s.length()){
            i++;
            j++;
        }
        while(j<=s.length()){
            if((s.substring(i,j)).equals(w)){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "hellohellohello";
        String w = "hello";
        System.out.println(counting(s,w));
    }
}


