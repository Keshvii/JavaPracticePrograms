/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practice.java;
import java.util.Scanner;

class Rectangle{
    private float x,y,l,h;

    public Rectangle(float x, float y, float l, float h) {
        this.x = x;
        this.y = y;
        this.l = l;
        this.h = h;
    }

    public void printRec(){
        System.out.println(
                  "x : " + this.x
                + "\ny : " + this.y
                + "\nlength : " + this.l
                + "\nheight : " + this.h 
        );
    }
    
    public Rectangle intersectionRec(Rectangle other){
        float overlapX = Math.min(this.x + this.l, other.x + other.l) - Math.max(this.x, other.x);
        float overlapY = Math.min(this.y + this.h, other.y + other.h) - Math.max(this.y, other.y);
        
        if( overlapX>0 && overlapY>0 ){
            float intersectX = Math.max(this.x,other.x);
            float intersectY = Math.max(this.y,other.y);
            float intersectLength = overlapX;
            float intersectHeight = overlapY;
            
            return new Rectangle(intersectX, intersectY, intersectLength, intersectHeight);
            
        }else{
            System.out.println("Rectangles do not overlap!");
            return new Rectangle(0,0,0,0);
        }
    }
    
    
    
}

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        float x1,y1,l1,h1,x2,y2,l2,h2;
        System.out.println("Enter top-left coordinates, length, height of two rectangles "
                + "to calculate overlap rectangle");
        System.out.print("Rectangle:1"+"\nx1 : ");
        x1 = sc.nextFloat();
        System.out.print("y1 : ");
        y1 = sc.nextFloat();
        System.out.print("l1 : ");
        l1 = sc.nextFloat();
        System.out.print("h1 : ");
        h1 = sc.nextFloat();
        System.out.print("Rectangle:2"+"\nx2 : ");
        x2 = sc.nextFloat();
        System.out.print("y2 : ");
        y2 = sc.nextFloat();
        System.out.print("l2 : ");
        l2 = sc.nextFloat();
        System.out.print("h2 : ");
        h2 = sc.nextFloat();
        
        Rectangle r1 = new Rectangle(x1,y1,l1,h1);
        Rectangle r2 = new Rectangle(x2,y2,l2,h2);
        System.out.println("For Rectangle:1");
        r1.printRec();
        System.out.println("For Rectangle:2");
        r2.printRec();
        
        System.out.println("For new Rectangle : ");
        Rectangle r3 = r1.intersectionRec(r2);
        r3.printRec();
        
        
    }
}
