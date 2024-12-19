package algo_based_questions;
import java_algorithms.BinarySearch_Recursive_Iterative;
public class RoatatedArrKTimesSearchTarget {

    public static int binarySearch(int[] arr, int target,int left,int right){

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){return mid;}
            else if(target<arr[mid]){right=mid-1;}
            else{left =mid+1;}
        }
        return -1;//if element not present
    }

    static int findInRoatatedArrKTimes(int[] arr, int target){

        int pivot = findPivotInRoatated(arr);

        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }

        if(target > arr[0]){
            return binarySearch(arr,target,0,pivot);
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int findPivotInRoatated(int[] arr){
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid = start + (end -start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 6;
        System.out.println(findInRoatatedArrKTimes(arr,tar));
    }

    //arr with duplicates
    int findPivotD(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

}
