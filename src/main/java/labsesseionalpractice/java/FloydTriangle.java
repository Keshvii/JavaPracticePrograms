/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsesseionalpractice.java;

/**
 *
 * @author keshv
 */
public class FloydTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n =5,p=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0) p=1;
            for(int j=1; j<=i;j++){
                System.out.print(p);
                p = 1-p;
            }
            System.out.println();
        }
            
    }
    
}
