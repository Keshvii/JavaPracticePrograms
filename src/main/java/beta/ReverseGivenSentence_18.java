package beta;

public class ReverseGivenSentence_18 {

    static StringBuilder rev(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse();
    }

    public static void main(String[] args) {

        String s = "Reverse a given sentence";
        System.out.println(rev(s));
    }
}
