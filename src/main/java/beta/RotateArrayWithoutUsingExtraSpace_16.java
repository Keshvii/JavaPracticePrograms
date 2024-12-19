package beta;

public class RotateArrayWithoutUsingExtraSpace_16 {
    public static void rotatedArr(int[] arr, int k) {

        int n = arr.length;
        k = k % n; // Ensure k is within the bounds of the array length
        // if (n <= 1 || k == 0) {
        //     return; // No need to rotate if array has 1 or fewer elements or k is 0
        // }

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);


    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotatedArr(arr,3);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    static int[] rotate(int arr[], int k){
        for(int j=0;j<k;j++){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1; i>=0 ; i--) {
                if (i == 0) {
                    arr[0] = temp;
                }else{
                    arr[i] = arr[i-1];
                }

            }
        }
        return arr;
    }

}




