package practice.java;

public class JaggedArray {
    public static void main(String[] args) {
//        int n = 5,c=0;
//        int[][] jd = new int[n][];
//        for(int i=0; i<n; i++){
//            jd[i] = new int[i+1];
//            for(int j=0; j<i+1; j++){
//                if(i%2==0 && j==0){
//                    c=1;
//                }
//                jd[i][j] = c;
//                c = 1-c;
//
//
//
//
//                System.out.print(jd[i][j]+" ");
//            }
//            System.out.println();
//        }

/*
        //Floyd's triangle
        int n=5, c=1;  
        int[][] arr = new int[n][];
        for(int i=0; i<n; i++){
            arr[i] = new int[i+1];
            for(int j=0; j<=i ; j++){
                if((i%2==0)&&(j==0)){
                    c=1;
                }
                arr[i][j] = c;
                System.out.print(c + " ");
                c = 1-c;
            }
            System.out.println();  
        } 

*/
//        int n = 5,c=0;
//        int[][] jd = new int[n][];
//        for(int i=0; i<n; i++){
//            jd[i] = new int[i+1];
//            for(int j=0; j<=i; j++){
//                jd[i][j] = c;
//                c++;
//                System.out.print(jd[i][j]+" ");
//            }
//            System.out.println();
//        }

        //JAGGED ARRAY: direct input
        int jarr[][] = {
                {1,2,3,4},
                {5,6},
                {7,8,9,0},
                {11}
        };

        System.out.println(jarr.length);//4:no.of rows
        for(int i=0; i< jarr.length; i++){
            for(int j=0; j< jarr[i].length; j++){
                System.out.print("["+i+"]"+"["+j+"] : "+jarr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println(maximumWealth(jarr));

    }
    public static int maximumWealth(int[][] accounts) {
        int maxsum =0;

        for(int i=0; i<accounts.length; i++){
            int rowsum =0;
            for(int j=0; j<accounts[i].length; j++){
                rowsum += accounts[i][j];
            }
            if(rowsum>maxsum){
                maxsum = rowsum ;
            }
        }

        return maxsum;
    }
}
