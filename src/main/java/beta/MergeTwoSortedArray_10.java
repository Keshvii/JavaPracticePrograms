package beta;

public class MergeTwoSortedArray_10 {
    static int[] mergedArr(int[] arr1, int[] arr2){
        int [] merged = new int[arr1.length+arr2.length];
        for(int i=0,j=0,k=0 ;k< arr1.length+arr2.length; k++){
            if (i>= arr1.length) {
                merged[k]=arr2[j];
                j++;
            }else if(j>= arr2.length){
                merged[k]=arr1[i];
                i++;
            }else if(arr1[i] < arr2[j]){
                merged[k]=arr1[i];
                i++;
            }else if(arr1[i] > arr2[j] ){
                merged[k]=arr2[j];
                j++;
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8,10};
        int c[] = mergedArr(a,b);
        for (int i: c){
            System.out.println(i);
        }
    }
}
