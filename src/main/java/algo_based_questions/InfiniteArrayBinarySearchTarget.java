package algo_based_questions;
//infinite array hence do not use length function
public class InfiniteArrayBinarySearchTarget {
    public static int infiniteArrayBinarySearch(int[] arr, int target, int start, int end){

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){return mid;}
            else if(target<arr[mid]){end=mid-1;}
            else{start =mid+1;}
        }

        return -1;
    }

    //finding appropriate frame
    //finding start end of frame
    static int findingIndexTarget(int[]arr,int target){
        int start = 0,end = 1;
//        int oldstart, oldend;
//        while(arr[end]<target){
//            oldstart = start;
//            oldend = end;
//            start = oldend+1;
//            end = oldend + (oldend-oldstart+1)*2;
//        }
        while(arr[end]<target){
            int temp = end+1;//new start
            end = end + (end-start+1)*2;
            start = temp;
        }

        return infiniteArrayBinarySearch(arr,target,start,end);
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,11,13,14,16,17,18,19,20,21,23,24,25,27,28,30,35,46,48,50,56,67,68,70,78,80,89,90,91,92,93,100,105,107,109,110,112,114,116,120,123,124,126,128,129,130,131,133,134,135,137,143,144,145,146,148,149,153,156,157,159,162,163,165,167,168,169,170,171,172,176,177,178,179,181,184,185,188,192,195,199};
        System.out.println(findingIndexTarget(arr,78));

    }
}
