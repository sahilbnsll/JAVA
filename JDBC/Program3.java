import java.sql.*;
public class Task_3 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_exp","root","sahil");

            Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = smt.executeQuery( "SELECT * FROM Employee where salary<15000" );

            while ( rs.next() )
            {
                int id = rs.getInt(1);
                String  name = rs.getString(2);
                int salary = rs.getInt(3);
                int phone = rs.getInt(4);
                int allowance = rs.getInt(5);

                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "PHONE = " + phone );
                System.out.println( "Allowance = " + allowance );
                System.out.println( "SALARY = " + salary );
                System.out.println();
            }
            rs.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
