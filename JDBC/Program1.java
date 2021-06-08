import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class JdbcConnection {
 
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_exp","root","sahil");
 
            String g = "create table Employee(id int(10) primary key , name varchar(30) not null, salary int(10), phone int(12), allowance int(10))";
 
            Statement stmt = con.createStatement();
            stmt.execute(g);
 
            System.out.println("table created in Database....");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

