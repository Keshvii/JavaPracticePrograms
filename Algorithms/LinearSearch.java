import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[100];

        for(int i=0; i<arr.length ; i++){ //creating array of 100 element chosen using Random class in range [0,100]
            arr[i]= r.nextInt(101);
        }

        System.out.println("Enter target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int indexOfTarget = linearSearch(arr,target);
        if(indexOfTarget == -1){
            System.out.println(target + " does not exist in list.");
        }else{
            System.out.println("Index of "+target+" in list is "+indexOfTarget);
        }

    }
}

/*
* Time Complexity
* Best Case: O(1)
* Average Case: O(n)  [O(n/2) : constants are ignored in Big-O notation, so this simplifies to O(n)]
* Worst Case: O(n)
*
* Space complexity
* O(n)
* */
