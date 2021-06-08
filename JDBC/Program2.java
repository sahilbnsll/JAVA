import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task_2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_exp","root","sahil");
            Statement stmt = con.createStatement();
            stmt = con.createStatement();
            String sql = " UPDATE Employee set allowance = allowance*1.1 WHERE salary>15000;; ";
            stmt.executeUpdate(sql);
            con.close();
        }
        catch(Exception e){ e.printStackTrace(); }
    }
}
