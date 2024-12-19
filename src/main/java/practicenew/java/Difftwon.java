package practicenew.java;
import java.util.HashSet;
public class Difftwon {
    static HashSet<String> func(int[] arr, int n){
        HashSet<String> al = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i: arr){
            if(hs.contains(i+2*n)){
                al.add(i+","+(i+2*n));
            }
            if(hs.contains(i-2*n)){
                al.add((i-2*n)+","+i);
            }

            hs.add(i);


        }

        return al;
    }
    static HashSet<String> pairsInArray(int arr[],int n){
        HashSet<String> al = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i:arr){
            if(hs.contains(i + 2 * n)){
                al.add("(" + i + ", " + (i + 2 * n) + ")");
            }
            if (hs.contains(i - 2 * n)) {
                al.add("(" + (i - 2 * n) + ", " + i + ")");
            }
            hs.add(i);

        }
        return al;
    }




    public static void main(String[] args) {
//        int[] numbers = {1,2,4,4,3,3,0,9,2,8,3};
//        int n1 = 3;
//        HashSet<String> hs = func(numbers,n1);
//        for(String s:hs){
//            System.out.println(s);
//        }

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i-1; j++) {
                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }



        for(int i: array){
            System.out.println(i);
        }

    }

}
