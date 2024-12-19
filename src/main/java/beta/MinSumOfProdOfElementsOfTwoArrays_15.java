package beta;

import java.util.Arrays;
import java.util.Collections;

public class MinSumOfProdOfElementsOfTwoArrays_15 {
    static int minSum(int arr1[], int arr2[], int s){
        int sum =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<s; i++){
            sum += arr1[i]*arr2[s-i-1];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr1[] = {3,-1,4,0};
        int arr2[] = {5,-3,2,0};
        System.out.println(minSum(arr1,arr2, arr1.length));
    }
}
