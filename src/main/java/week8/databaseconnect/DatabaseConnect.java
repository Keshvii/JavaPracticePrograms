/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package week8.databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "system";
        String password = "kv";

        // Attempt to establish connection
        System.out.println("before try");

            // Register Oracle JDBC driver


            try { // Establish connection
                //Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection connection = DriverManager.getConnection(url, user, password);
                if (connection != null) {
                    System.out.println("Connected to the database!");
                    // Perform database operations here


                } else {
                    System.out.println("Failed to make connection!");
                }

            } catch (SQLException e) {
                System.out.println("Failed to establish database connection: " + e.getMessage());
                e.printStackTrace();
            }



    }
}



