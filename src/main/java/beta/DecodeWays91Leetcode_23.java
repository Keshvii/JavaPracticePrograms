package beta;

public class DecodeWays91Leetcode_23 {
    static int numDecodings(String s){
        if(s.length()==0 || s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int counti_1 =1, counti_2=1;
        for(int i=1; i<s.length(); i++){
            int d = s.charAt(i)-'0';
            int dd = (s.charAt(i-1)-'0')*10+d;

            int count = 0;

            if (d>0){
                count += counti_1;
            }
            if(dd>=10 && dd<=26){
                count += counti_2;
            }

            counti_1 = counti_2;
            counti_2 = count;

        }

        return counti_2;

    }

    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }
}
