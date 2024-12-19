package beta;

public class RevEachWordOfString_19 {
    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        s = String.valueOf(sb.reverse());
        String w[] = s.split(" ");
        String res="";
        for(int i=0; i<w.length-1; i++){
            res = " "+w[i] +  res;
        }

        return w[w.length-1]+res;
    }


    public static void main(String[] args) {
        String s = "Reverse each word of a string";
        //System.out.println(reverseWords(s));
        System.out.println(rreverseWords("  hello world  "));
    }
    public static String rreverseWords(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        String[] st = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = st.length-1; i >= 0; i--){
            sb.append(st[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
