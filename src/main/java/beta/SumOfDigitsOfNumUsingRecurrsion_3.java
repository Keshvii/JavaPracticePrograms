package beta;

public class SumOfDigitsOfNumUsingRecurrsion_3 {

    static int sumOfDigitsRecurrsive(int n){
        if(n<0){
            n = -n;
        }
        if(n==0){
            return 0;
        }
        return sumOfDigitsRecurrsive(n/10)+n%10;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits: " + sumOfDigitsRecurrsive(num));
    }

//    static int sumOfDigitsIterative(int n){
//        if(n<0){
//            n = -n;
//        }
//        int sum=0;
//        while(n>0){
//            sum += n%10;
//            n/=10;
//        }
//        return sum;
//    }
}
