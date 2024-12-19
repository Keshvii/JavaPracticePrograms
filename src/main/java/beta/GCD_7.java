package beta;

public class GCD_7 {
    static int gcdIterative(int a, int b){
        if(b==0){
            return a;
        }
        return gcdIterative(b,a%b);
    }
    static int gcdRecurrsive(int a, int b){
        if(b==0){
            return a;
        }
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(gcdRecurrsive(12,18));

    }
}
