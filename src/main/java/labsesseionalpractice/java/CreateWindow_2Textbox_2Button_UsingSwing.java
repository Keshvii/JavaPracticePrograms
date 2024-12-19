
package labsesseionalpractice.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SwingDemo1 {
    private JTextField nameField, idField;
    private JButton storeButton, deleteButton;
    private Connection connection;

    public SwingDemo1(Connection connection) {
        this.connection = connection;

        JFrame jf = new JFrame("My First Swing Window");
        jf.setSize(400, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();

        storeButton = new JButton("Store Data");
        deleteButton = new JButton("Delete Data");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(storeButton);
        panel.add(deleteButton);

        jf.pack();

        jf.add(panel);

        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to store data in Student table
                String name = nameField.getText();
                String id = idField.getText();
                // Assuming Student table has columns 'name' and 'student_id'
                String sql = "INSERT INTO Student (name, student_id) VALUES (?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, name);
                    statement.setString(2, id);
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Data stored successfully.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to delete data from Student table
                String id = idField.getText();
                // Assuming Student table has column 'student_id'
                String sql = "DELETE FROM Student WHERE student_id = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, id);
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null, "Data deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No data found for the given ID.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}

public class CreateWindow_2Textbox_2Button_UsingSwing {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {

    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
    String user = "system";
    String password = "kv";

    // Establish connection (outside SwingDemo)
    Connection connection = DriverManager.getConnection(url, user, password);

    if (connection != null) {
      System.out.println("Connected to the database!");
      // create window and pass connection as parameter
      SwingDemo1 sd = new SwingDemo1(connection);
    } else {
      System.out.println("Failed to make connection!");
    }
  }
}
