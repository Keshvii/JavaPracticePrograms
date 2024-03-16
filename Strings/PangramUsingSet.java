
import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        Set<Character> s = new HashSet<>();
        String str = "Puzzled women bequeath jerks very exotic gifts";
        char[] c1 = str.toLowerCase().toCharArray();
        for(char c: c1){
            if(c>=97 && c<=122){
                s.add(c);
            }
        }
        System.out.println(s);
        if(s.size()==26){
            System.out.println("Pangram");
        }
        
        
    }
    
}
