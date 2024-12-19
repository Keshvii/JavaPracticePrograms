package JavaSess1Questions;


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//
//class SwingDemo1{
//    Connection conn;
//    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
//    String user = "system";
//    String password = "kv";
//
//    SwingDemo1(){
//
//        try{
//            conn = DriverManager.getConnection(url,user,password);
//            if(conn != null){
//                System.out.println("connected");
//            }
//
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//
//        JFrame jf = new JFrame("ID-Password Verification");
//        jf.setSize(300,400);
//        jf.setLayout(new GridLayout(4,1));
//
//        JLabel jlbl = new JLabel("Enter EmpId");
//        JTextField jtxt1 = new JTextField();
//        JButton jbtn = new JButton("Delete");
//
//        jf.add(jlbl);
//        jf.add(jtxt1);
//        jf.add(jbtn);
//
//        ActionListener al = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                try {
//                    // Update Department to set DMgrId to NULL
////                    String txt = jtxt1.getText();
////                    String q1 = "UPDATE Department SET DMgrId = NULL WHERE DMgrId = 'E102'";
////                    PreparedStatement stmt1 = conn.prepareStatement(q1);
////                    //stmt1.setString(1, txt);
////
////                    int n = stmt1.executeUpdate();
////
////                    if (n == 0) {
////                        JOptionPane.showMessageDialog(null, "Not a Manager");
////                    }
////                        // Delete from Employee
////                        String q2 = "DELETE FROM Employee WHERE EmpId = 'E102'";
////                        PreparedStatement stmt2 = conn.prepareStatement(q2);
////                        //stmt2.setString(1, txt);
////                        int deletedRows = stmt2.executeUpdate();
////
////                        if (deletedRows > 0) {
////                            JOptionPane.showMessageDialog(null, "Record deleted from Employee");
////                        } else {
////                            JOptionPane.showMessageDialog(null, "No record found in Employee");
////                        }
//                    String deleteEmployeeQuery = "DELETE FROM Employee WHERE EmpId=?";
//                    PreparedStatement deleteEmployeeStatement = conn.prepareStatement(deleteEmployeeQuery);
//                    deleteEmployeeStatement.setString(1, jtxt1.getText());
//                    deleteEmployeeStatement.executeQuery();
//
//                    // Update Department table if the deleted employee was a manager
//                    if (deletedRows > 0) {
//                        String updateDepartmentQuery = "UPDATE Department SET DMgrId = NULL WHERE DMgrId = ?";
//                        PreparedStatement updateDepartmentStatement = conn.prepareStatement(updateDepartmentQuery);
//                        updateDepartmentStatement.setString(1, jtxt1.getText());
//                        updateDepartmentStatement.executeUpdate();
//                        JOptionPane.showMessageDialog(null, "Employee deleted successfully.");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Employee with ID " + jtxt1.getText() + " does not exist.");
//                    }
//
//                    // Close database connection
//                    conn.close();
//
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//
//        jbtn.addActionListener(al);
//
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setVisible(true);
//    }
//
//}
//
//
//public class DeptEmployeeSchemaExecuteQuerySwing {
//    public static void main(String[] args) {
//        Runnable r = new Runnable(){
//            @Override
//            public void run(){
//
//                SwingDemo1 s = new SwingDemo1();
//            }
//
//        };
//
//        SwingUtilities.invokeLater(r);
//    }
//}
