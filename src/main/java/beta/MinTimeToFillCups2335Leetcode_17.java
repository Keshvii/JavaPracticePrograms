package beta;

public class MinTimeToFillCups2335Leetcode_17 {
    static int minTime(int[] arr){
        int max = Math.max(Math.max(arr[0],arr[1]),arr[2]);
        int sum = arr[0]+arr[1]+arr[2];
        return Math.max(max,(sum+1)/2);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2};
        System.out.println(minTime(arr));
    }
}
