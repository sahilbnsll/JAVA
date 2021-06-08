import java.sql.*;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_exp","root","sahil");

            String g  = "insert into Employee(id ,name, salary, phone, allowance) values( ?, ?, ?, ?, ?)";

            PreparedStatement ptsmt = con.prepareStatement(g);

            Scanner sc = new Scanner(System.in);

            for(int i=0;i<5;i++){
                System.out.println("Enter ID :");
                int id = sc.nextInt();

                System.out.println("Enter Name:");
                String Name = sc.next();

                System.out.println("Enter Salary:");
                int salary = sc.nextInt();

                System.out.println("Enter Phone:");
                long phone = sc.nextLong();

                System.out.println("Enter Allowance:");
                int allowance = sc.nextInt();

                //set the values
                ptsmt.setInt(1, id);
                ptsmt.setString(2, Name);
                ptsmt.setInt(3, salary);
                ptsmt.setInt(4, (int) phone);
                ptsmt.setInt(5, allowance);

                ptsmt.executeUpdate();
                System.out.println("");
            }
            System.out.println("Inserted Successfully...");

            con.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
