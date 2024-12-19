package beta;

public class MaxSumSubarray_11 {
    //Kadane's Algo
    static int maxSubArray(int[] arr){
        int max_current = arr[0];
        int max_global = arr[0];

        for(int i=1; i<arr.length; i++){
            //max_current = Math.max(arr[i], max_current+arr[i]);
            //max_global = Math.max(max_current, max_global);
            if(arr[i]>max_current+arr[i]){
                max_current = arr[i];
            }else{
                max_current = max_current + arr[i];
            }

            if(max_current>max_global){
                max_global = max_current;
            }

        }

        return max_global;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println(maxSum);
        Result rs = maxSumWithIndicesOfSubarray(nums);
        System.out.println(rs);
    }

    static Result maxSumWithIndicesOfSubarray(int arr[]){
        int max_current=arr[0];
        int max_global =arr[0];
        int start=0,end=0,tempStart=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max_current+arr[i]){
                max_current = arr[i];
                tempStart = i;
            }else{
                max_current += arr[i];
            }
            if(max_current>max_global){
                max_global = max_current;
                start = tempStart;
                end = i;
            }
        }
        return new Result(max_global,start,end);
    }


    //Max sum with indices
    static class Result{
        private final int sum;
        private final int start;
        private final int end;

        public Result(int sum,int start,int end ) {
            this.end = end;
            this.start = start;
            this.sum = sum;
        }
        public String toString(){
            return "MaxSum : "+sum + "\nStart : "+start+ "\nEnd : "+end;
        }
    }

}
