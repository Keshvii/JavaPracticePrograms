package JavaSess1Questions;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class SwingDemo{

    SwingDemo(){
        JFrame jf = new JFrame("ID-Password Verification");
        jf.setSize(300,400);
        jf.setLayout(new GridLayout(4,1));

        JLabel jlbl = new JLabel("Msg");
        JTextField jtxt1 = new JTextField("Id");
        JTextField jtxt2 = new JTextField("Password");
        JButton jbtn = new JButton("Submit");

        jf.add(jlbl);
        jf.add(jtxt1);
        jf.add(jtxt2);
        jf.add(jbtn);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try(BufferedReader  bf = new BufferedReader(new FileReader("password.txt"))){
                    String line;
                    boolean exist = false;
                    while((line = bf.readLine())!=null){
                        String[] s = line.split(" ");
                        String id = jtxt1.getText();
                        String pass = jtxt2.getText();

                        if((s[0].equals(id)) && (s[1].equals(pass))){
                            exist = true;
                            break;
                        }

                    }
                    if(exist){
                        System.out.println("Valid");
                        jlbl.setText("Valid");
                        JOptionPane.showMessageDialog(null,"Valid");
                    }else{
                        System.out.println("Invalid");
                        jlbl.setText("Invalid");
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                }catch(IOException e){
                    System.out.println(e);
                }

            }
        };

        jbtn.addActionListener(al);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}


public class SwingIdPasswordVerification {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                SwingDemo s = new SwingDemo();
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
