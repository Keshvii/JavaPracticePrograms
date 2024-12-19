package algo_based_questions;

public class FindMinIndexOfTargetInMountainArray {

    public static int peakIndexMountainArray(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid + 1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static int orderAgnosticBinarySearch(int arr[], int target, boolean increasing, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(increasing){
                if(arr[mid]<target){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }else{
                if(arr[mid]>target){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    static int minIndex(int arr[],int target){
        int peak =  peakIndexMountainArray(arr);
        int temp;
        if((temp = orderAgnosticBinarySearch(arr,target,true,0,peak))!=-1){
            return temp;
        }
        return orderAgnosticBinarySearch(arr,target,false,peak+1,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,4,2,0};
        int target = 4;
        System.out.println(minIndex(arr,target));    }
}
