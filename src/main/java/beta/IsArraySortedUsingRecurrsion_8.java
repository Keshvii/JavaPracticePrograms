package beta;

public class IsArraySortedUsingRecurrsion_8 {
    static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[0] <= arr[arr.length-1]){
            return arr[index] <= arr[index+1] && isSorted(arr,index+1);
        }else{
            return arr[index] >= arr[index+1] && isSorted(arr,index+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {808,90,868,34,2};
        System.out.println("Given array is sorted: "+isSorted(arr,0));
    }
}
