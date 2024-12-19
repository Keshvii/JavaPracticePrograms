package algo_based_questions;
import java.util.*;

public class MountainArrayPeakFind {
    public static int peakIndexInMountainArray(int[] arr) {
//        int start=0, end=arr.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            System.out.println(mid);
//            if((arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])){
//                return mid;
//            }else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
//                start = mid;
//            }else{
//                end = mid;
//            }
//        }
//        return -1;

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                // We are in the increasing part of the array
                start = mid + 1;
            }

        }
        // At the end of the loop, start == end and pointing to the peak element
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
