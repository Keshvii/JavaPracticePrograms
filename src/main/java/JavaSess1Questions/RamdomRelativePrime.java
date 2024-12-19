package JavaSess1Questions;

import java.util.Random;

public class RamdomRelativePrime {

    public static int noRelPrime(int n){
        int count=0;
        for(int i=2; i<n; i++){
            if(gcdCalc(n,i)==1){
                count++;
            }
        }

        return count;
    }
    public static int gcdCalc(int a,int b){
        if(b==0){
            return a;
        }
        return gcdCalc(b,a%b);
    }



    public static void main(String[] args) {
        Random r1 = new Random();
        int n1 = r1.nextInt(97)+3; // 3<=n1<100
        int n2 = r1.nextInt(97)+3;

        System.out.println(n1 + "," + n2);

        if(noRelPrime(n1)>noRelPrime(n2)){
            System.out.println("noRelPrime("+n1+")="+noRelPrime(n1)+" > "+"noRelPrime("+n2+")="+noRelPrime(n2));
        }else{
            System.out.println("noRelPrime("+n1+")="+noRelPrime(n1)+" < "+"noRelPrime("+n2+")="+noRelPrime(n2));
        }

    }
}
