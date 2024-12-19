package beta;

public class LargestPalindromicSubstring_22 {
    static String largestPalindrome(String s){
        if(s.length()<=0){
            return "";
        }
        int start=0, end=0;

        for(int i=0; i<s.length(); i++){//i=0

            //even Palin
            int elen = palinLength(s,i,i+1);
            //odd Palin
            int olen = palinLength(s,i,i);

            int mlen = Math.max(elen,olen);

            if(mlen>(end-start+1)){
                start = i - (mlen-1)/2;
                end = i + mlen/2;
            }

        }


        return s.substring(start,end+1);
    }

    static int palinLength(String s,int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }



    public static void main(String[] args) {
        String s = "wcwabacecad";
        System.out.println(largestPalindrome(s));
    }
}
