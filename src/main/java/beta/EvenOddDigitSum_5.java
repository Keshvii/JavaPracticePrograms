package beta;

public class EvenOddDigitSum_5 {
    static int evenOddDigitSum(int n, boolean flag){
        int sum=0, sum_e = 0, counter=1;
        while(n>0){
            int digit = n%10;
            if(flag==true){
                if(counter%2==0){
                    sum += digit;
                }
            }else{
                if(counter%2!=0){
                    sum += digit;
                }
            }
            counter++;
            n/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(evenOddDigitSum(n,false));
    }
}
