/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week13_14.dbconnprac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SwingDemo{
    Connection conn;
    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
    String user = "system";
    String password = "kv";
    
SwingDemo(){
    
    try{
        conn = DriverManager.getConnection(url,user,password);
        if(conn != null){
            System.out.println("connected");
        }
    
    }catch(SQLException e){
        System.out.println(e);
    }
    
    
    JFrame jf = new JFrame("My swing app");
    jf.setSize(300,400);
    jf.setLayout(new GridLayout(3,2));
    
    JLabel jlbl1 = new JLabel("EmpID : ");
    JTextField jtf1 = new JTextField();
    JLabel jlbl2 = new JLabel("EmpName : ");
    JTextField jtf2 = new JTextField();
    
    JButton jbtn1 = new JButton("Store");
    JButton jbtn2 = new JButton("Delete"); 
    
    jf.add(jlbl1);
    jf.add(jtf1);
    jf.add(jlbl2);
    jf.add(jtf2);
    jf.add(jbtn1);
    jf.add(jbtn2);
    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
    
    ActionListener al1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
            String s = "Insert into Employee values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(s);
            stmt.setString(1, jtf1.getText());
            stmt.setString(2, jtf2.getText());
            stmt.executeQuery();
            JOptionPane.showMessageDialog(null, "Data added successfully.");
            }catch(SQLException e){
                System.out.println(e);
            }
            
        }
    };
    jbtn1.addActionListener(al1);
    
    
    ActionListener al2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                String s = "Delete from Employee where EmpID=? and EmpName=?";
                PreparedStatement stmt = conn.prepareStatement(s);
                stmt.setString(1, jtf1.getText());
                stmt.setString(2, jtf2.getText());
                stmt.executeQuery();
                JOptionPane.showMessageDialog(null, "Data deleted successfully.");
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    
    };
    jbtn2.addActionListener(al2);
    
}


}


public class SwingDbConn {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run(){
                SwingDemo s = new SwingDemo();
            }
            
        };
        
        SwingUtilities.invokeLater(r);
    }
    
}
