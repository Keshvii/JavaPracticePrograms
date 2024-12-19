package JavaSess1Questions;

import java.util.LinkedList;
import java.util.Scanner;

class ListCombiner{
    //instance variables
    private String s;
    private int i;

    public ListCombiner(String s, int i){
        this.s = s;
        this.i = i;
    }
    
    @Override
    public String toString(){
        return s + " " + i; 
    }
}


public class IntegerLinkedList_StringLinkedList_Join {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to enter in both LinkedLists");
        int n = sc.nextInt();
        sc.nextLine();
        //ll1
        System.out.println("ll1: Enter String elements");
        for(int i=0; i<n; i++){
            System.out.print("ll1: Element["+i+"] : ");
            String s = sc.nextLine();
            ll1.add(s);
        }
        //ll1
        System.out.println("ll2: Enter Integer elements");
        for(int i=0; i<n; i++){
            System.out.print("ll2: Element["+i+"] :");
            int s = sc.nextInt();
            ll2.add(s);
        }
        //combined
        LinkedList<ListCombiner> ll3 = new LinkedList<>();

        ListCombiner lc ;
        for(int i=0; i<n; i++){
            lc = new ListCombiner(ll1.get(i),ll2.get(i));
            ll3.add(lc);
        }

        System.out.println(ll3);


    }
}




//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class IntegerLinkedList_StringLinkedList_Join {
//    public static void main(String[] args) {
//        LinkedList<String> ll1 = new LinkedList<>();
//        LinkedList<Integer> ll2 = new LinkedList<>();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of elements to enter in both LinkedLists");
//        int n = sc.nextInt();
//        sc.nextLine();
//        //ll1
//        System.out.println("ll1: Enter String elements");
//        for(int i=0; i<n; i++){
//            System.out.print("ll1: Element["+i+"] : ");
//            String s = sc.nextLine();
//            ll1.add(s);
//        }
//        //ll1
//        System.out.println("ll2: Enter Integer elements");
//        for(int i=0; i<n; i++){
//            System.out.print("ll2: Element["+i+"] :");
//            int s = sc.nextInt();
//            ll2.add(s);
//        }
//        //combined
//        LinkedList<String> ll3 = new LinkedList<>();
//
//        for(int i=0; i<n; i++){
//            String s = ll1.get(i)+" "+ll2.get(i);
//            ll3.add(s);
//        }
//
//        System.out.println(ll3);
//
//
//    }
//}




