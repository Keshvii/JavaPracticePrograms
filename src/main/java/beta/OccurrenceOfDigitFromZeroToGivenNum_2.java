package beta;

import java.util.ArrayList;

public class OccurrenceOfDigitFromZeroToGivenNum_2 {
//    static ArrayList<Integer> numbersWithDigit(int n, int d){
//        ArrayList<Integer> ar = new ArrayList<>();
//
//        String digit = Integer.toString(d);
//        for(int i=d; i<=n; i++){
//            if(Integer.toString(i).contains(digit)){
//                ar.add(i);
//            }
//
//        }
//        return ar;
//    }

    static ArrayList<Integer> allNums(int n, int d){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=d; i<=n; i++){
            int num = i;
            while (num>0){
                int temp = num%10;
                num/=10;
                if(temp==d){
                    list.add(i);
                    break;
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int n = 33;
        int d = 2;
        System.out.println("Elements "+allNums(n,d));
    }
}
