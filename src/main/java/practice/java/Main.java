/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class Ant{
    int i;
    int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class ant extends Ant{
    int k;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Child c = new Child(3,4,0);
//        System.out.println(c.toString());
//        Child d;
//        d = c;
//        System.out.println(d.toString());
        ant a1 = new ant();
//        a1.setI(1);
//        a1.setJ(2);
        a1.setK(3);
        System.out.println(a1.getK());

//        if(a1.getI()==1){
//            System.out.println(a1.getJ() + " "+ a1.getK());
//        }





    }
    
}
