package beta;

import java.util.HashSet;

public class ArrayElementPairDifference2N_12 {

    static HashSet<String> pairsInArray(int arr[],int n){
        HashSet<String> al = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i:arr){
            if(hs.contains(i + 2 * n)){
                al.add("(" + i + ", " + (i + 2 * n) + ")");
            }
            if (hs.contains(i - 2 * n)) {
                al.add("(" + (i - 2 * n) + ", " + i + ")");
            }
            hs.add(i);

        }
        return al;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,4,4,3,3,0,9,2,3};
        int n1 = 3;
        HashSet<String> hs = pairsInArray(numbers,n1);
        for(String s:hs){
            System.out.println(s);
        }
    }


}
