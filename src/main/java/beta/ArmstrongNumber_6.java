package beta;

public class ArmstrongNumber_6 {
    static boolean isArmstrong(int num){
        int n = num;
        int digits = (int) (Math.log10(num)+1);
        int sum=0;
        while(num>0){
            sum += (int) Math.pow(num%10,digits);
            num /=10;
        }

        if(sum==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n + " is Armstrong Number: "+isArmstrong(n));
    }
}
