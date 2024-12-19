

package labsesseionalpractice.java;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Dbconnprac {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String user = "system";
        String password = "kv";
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            if(conn != null){
                System.out.println("Connected");
                createDB(conn);
                insertData(conn);
                selectData(conn);
            }else{
                System.out.println("Disconnected");
            }
            
        }catch(SQLException e){
            System.out.println("Error " + e);
        }  
    }
    private static void createDB(Connection conn)throws SQLException{
        try{
            String s = "Create table Employee(EmpID varchar2(10),EmpName varchar2(20))";
            PreparedStatement stmt = conn.prepareStatement(s);
            stmt.executeQuery();
            System.out.println("Success create");
        }catch(SQLException e){
            System.out.println("error create query");
        }
    } 
    
    private static void insertData(Connection conn){
        try{
        String s = "Insert into Employee values(?,?)";
        PreparedStatement stmt = conn.prepareStatement(s);
        stmt.setString(1, "A201");
        stmt.setString(2,"KVK");
        stmt.executeQuery();
        }catch(SQLException e){
            System.out.println("Insert error"+e);
        }
        
    }
    
    private static void selectData(Connection conn){
        try{
            String s  = "select * from Employee";
            PreparedStatement stmt = conn.prepareStatement(s);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+"-"+rs.getString(2));
            }
        }catch(SQLException e){
        
            System.out.println("error in select");
        }
    
    
    }
    
}
