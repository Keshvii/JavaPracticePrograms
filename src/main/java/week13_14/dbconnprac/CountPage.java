/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week13_14.dbconnprac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountPage {
    private int countValue1 = 0;
    private int countValue2 = 0;

    public CountPage() {
        JFrame jf = new JFrame("My Swing App");
        jf.setSize(300, 400);
        jf.setLayout(new GridLayout(3, 1));

        JLabel jlbl1 = new JLabel("Countbtn1");
        //JLabel jlbl2 = new JLabel(Integer.toString(countValue)); // Display initial count value
        JLabel jlbl2 = new JLabel("Countbtn2");
        JButton jbtn1 = new JButton("Increment");
        JButton jbtn2 = new JButton("Decrement");

        jf.add(jlbl1);
        jf.add(jlbl2);
        jf.add(jbtn1);
        jf.add(jbtn2);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        // Action Listener for both buttons
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==jbtn1){
                    countValue1++;
                    jlbl1.setText(Integer.toString(countValue1));
                }else{
                    countValue2++;
                    jlbl2.setText(Integer.toString(countValue2));
                }
            }
        };
        jbtn1.addActionListener(buttonListener);
        jbtn2.addActionListener(buttonListener);
    }

    public static void main(String[] args) {
        CountPage countPage = new CountPage();
    }
}









//
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
////import java.sql.PreparedStatement;
////import java.sql.SQLException;
//
//
//class sww {
//    private int count=0;
//    public sww(){
//        JFrame jf = new JFrame("My swing app");
//    jf.setSize(300,400);
//    jf.setLayout(new GridLayout(3,1));    
//    JLabel jlbl1 = new JLabel("count");
//
//    JLabel jlbl2 = new JLabel("countValue");
// 
//    
//    JButton jbtn1 = new JButton("Press");
//  
//    
//    jf.add(jlbl1);
// 
//    jf.add(jlbl2);
//  
//    jf.add(jbtn1);
//
//    
//
//    
//    ActionListener al1 = new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent ae){
//           count++; // Increment count value
//           jlbl2.setText(Integer.toString(count));
//        }
//    };
//    jbtn1.addActionListener(al1);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    jf.setVisible(true);
// 
//    }
//}
//public class CountPage {
//
//    public static void main(String[] args) {
//        sww countPage = new sww();
//    }
//}