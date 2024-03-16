import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        String str1 = "Parliam;en,t";
        String str2 = " Partial Men";
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();
        for(char c : c1){
            if(c>=97 && c<=122){
                s1.add(c);
            }
        }
        for(char c : c2){
            if(c>=97 && c<=122){
                s2.add(c);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("Anagram");
        }
    }
    
}
