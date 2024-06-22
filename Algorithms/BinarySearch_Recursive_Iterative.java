package java_algorithms;

public class BinarySearch_Recursive_Iterative {
    public static int binarySearchIterative(int[] arr, int target){
        int left=0, right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){return mid;}
            else if(target<arr[mid]){right=mid-1;}
            else{left =mid+1;}
        }
        return -1;//if element not present
    }

    public static int binarySearchRecurrsive(int arr[], int target, int left, int right){
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(target == arr[mid]) {
            return mid;
        }else if (target<arr[mid]) {
            return binarySearchRecurrsive(arr,target,left,mid-1);
        }else{
            return binarySearchRecurrsive(arr, target, mid+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        System.out.println(binarySearchIterative(arr,10));
        System.out.println(binarySearchRecurrsive(arr,10,0, arr.length-1));
    }
}
