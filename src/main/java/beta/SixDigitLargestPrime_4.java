package beta;

public class SixDigitLargestPrime_4 {
    static int largestPrime(int digits){
        int largestNum = largestNum(digits);
        for(int n=largestNum; n>=largestNum-100; n--){
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                return n;
            }
        }
        return -1;
    }

    static int largestNum(int digits){
        int num = 0;
        for(int i= 0; i<digits;i++ ){
            num += (int)(Math.pow(10,i)*9);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(largestPrime(6));

    }
}
