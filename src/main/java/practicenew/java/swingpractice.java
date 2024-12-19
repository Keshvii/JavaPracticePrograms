package practicenew.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class SwingDemo{
    Connection conn;
    String url="jdbc:oracle:thin:@localhost:1521:XE",user="system",password="kv";
    public SwingDemo(){
        try{
            conn = DriverManager.getConnection(url,user,password);
            if(conn!=null){
                System.out.println("Connected");
            }
        }catch(SQLException e){
            System.out.println(e);
        }

        JFrame jf = new JFrame("ques1");
        jf.setSize(300,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3, 1));
        JLabel jlbl = new JLabel("Message");
        JTextField jtxt = new JTextField();
        JButton jbtn = new JButton("Submit");
        jf.add(jlbl);
        jf.add(jtxt);
        jf.add(jbtn);

        ActionListener al = new ActionListener(){
            public void actionPerformed(ActionEvent ae){
//                String s = jtxt.getText();
//                jtxt.setText("Action Performed");
//                JOptionPane.showMessageDialog(null,
//                        s+"Action comp");

                String s = "Insert into Table values(?)";
                try {
                    PreparedStatement ps = conn.prepareStatement(s);
                    ps.setString(1,jtxt.getText());
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        System.out.println(rs.getString(1));
                    }

                } catch (SQLException e) {
                    System.out.println(e);
                }


            }
        };
        jbtn.addActionListener(al);

        jf.setVisible(true);
    }


}


public class swingpractice {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            public void run(){
                SwingDemo d = new SwingDemo();
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
