package algo_based_questions;

public class CeilingAndFloorValueInArray {
    //based on binary search. sorted array provided
    public static int ceilValueInArray(int arr[], int target){
        if(target>arr[arr.length-1]){
            return -1;
        }

        int left=0; int right=arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(target==arr[mid]){
                return arr[mid];
            } else if (target<arr[mid]) {
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return arr[left];

    }
    public static int floorValueInArray(int arr[], int target){
        if(target>arr[arr.length-1]){
            return -1;
        }

        int left=0; int right=arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(target==arr[mid]){
                return arr[mid];
            } else if (target<arr[mid]) {
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return arr[right];

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target < letters[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return letters[left%letters.length];
    }

    public static void main(String[] args) {
        char[] l = {'c','f','j','k','m','r'};
        char t = 'f';
        System.out.println("==" + nextGreatestLetter(l,t));

        int arr[] = {2,3,5,9,14,16,18};
        int target = 10;
        System.out.println("Ceiling value: "+ceilValueInArray(arr,target));
        System.out.println("Floor value : "+ floorValueInArray(arr,target));
    }
}
