package algo_based_questions;

public class ArrayRotationCount {

    static int rotationCount(int arr[]){
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }

            if(arr[mid]>arr[start]){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int arr[]={15,18,2,3,6,12};
        System.out.println("RotationCount k: "+ (rotationCount(arr)+1));
    }
}
