package java_algorithms;

public class OrderAgnosticBinarySearch {

    public static int  orderAgnosticBS(int arr[],int target){
        int left=0, right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){return mid;}
            if(arr[left] < arr[right]) {//is ascending
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {40,10,4,3,2};
        int target = 10;
        System.out.println(orderAgnosticBS(arr,10));
    }
}
