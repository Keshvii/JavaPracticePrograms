package java_algorithms;

public class BubbleSort {
    static int[] bubbleSort(int arr[]){
        boolean swapped;

        for(int i=0; i< arr.length-1; i++){
            swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;
                }
            }
            if(!swapped){
                return arr;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        arr = bubbleSort(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
