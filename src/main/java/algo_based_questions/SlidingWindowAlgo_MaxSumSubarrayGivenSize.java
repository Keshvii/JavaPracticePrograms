package algo_based_questions;

import java.util.ArrayList;

/*Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
NOTE: A subarray is a contiguous part of any given array.
*/
public class SlidingWindowAlgo_MaxSumSubarrayGivenSize {

/*
* long maxSum=Integer.MIN_VALUE,currSum;

        for(int i=0; i<=N-K; i++){
            currSum = 0;
            for(int j=i; j<=i+(K-1); j++){
                currSum += Arr.get(j);
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }

        }
        return maxSum;
* */

    //optimized
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        long currSum=Arr.get(0);

        for(int i=1; i<K; i++){
            currSum += Arr.get(i);
        }
        long maxSum = currSum;

        for(int i=K; i<N; i++){
            currSum += Arr.get(i) - Arr.get(i-K);
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
    }
}

/* N=10 k=4
* 0 1 2 3 4 5 6 7 8 9
* */
