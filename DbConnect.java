
package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    public static Statement st1;
    static{
        try{
            c=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/salesdb"+"?useSSL=false","root","Uh17912@");
            st =c.createStatement();
            st1 =c.createStatement();
        }
        catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);  
}
    }

    public static class st1 {

        public st1() {
        }
    }
}
