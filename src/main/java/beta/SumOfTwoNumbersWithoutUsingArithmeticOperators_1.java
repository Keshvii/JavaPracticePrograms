package beta;

public class SumOfTwoNumbersWithoutUsingArithmeticOperators_1 {
    public static void main(String[] args) {
        int a = 42;
        int b = -4;
        System.out.println(sum(a,b));
    }
    static int sum(int a, int b){
        while(b!=0){
            int carry = (a & b)<<1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
