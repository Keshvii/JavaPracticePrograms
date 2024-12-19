package practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcodePrac {
    public static void addToArrayForm(int[][] num) {
        int r = num.length;
        int newa[][] = new int[r][r];

        for(int i=0; i<r; i++){
            for (int j=0; j<r; j++){
                newa[i][j] = num[r-j-1][i];
                System.out.print(newa[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int num[][] = {{1,2,3},{1,4,8},{5,6,7}};
        addToArrayForm(num);
    }
}
