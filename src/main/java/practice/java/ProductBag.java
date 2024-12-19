/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

class Product{
    private String P_name,P_company;

    public String getP_name() {
        return P_name;
    }
    public void setP_name(String P_name){
        this.P_name = P_name;
    }

    public String getP_company() {
        return P_company;
    }

    public void setP_company(String P_company) {
        this.P_company = P_company;
    }
    
    
}


class Bag extends Product{
    private String B_type;

    public String getB_type() {
        return B_type;
    }

    public void setB_type(String B_type) {
        this.B_type = B_type;
    }
}

public class ProductBag {

    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.setP_name("Handbag");
        b1.setP_company("NIKE");
        b1.setB_type("Leather");
        
        Bag b2 = new Bag();
        b2.setP_name("HandPurse");
        b2.setP_company("Adidas");
        b2.setB_type("Leather");
        
        Bag b3 = new Bag();
        b3.setP_name("Batua");
        b3.setP_company("LocalMaal");
        b3.setB_type("Plastic");
        
        Bag[] bag = {b1,b2,b3};
        
        for(Bag b : bag){
            if(b.getB_type().equals("Leather")){
                System.out.print("Prod name: "+b.getP_name());
                System.out.println(" & Prod company: "+b.getP_company());
            }
        }
        
        
        
    }
    
}
