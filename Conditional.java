import java.util.Scanner;

public class Conditional {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter Your Age: ");
        int age= sc.nextInt();
        boolean cond=(age>=18);
        if(cond){
            System.out.println("Yes, You're Eligible for Driving!");
        }
        else {
            System.out.println("NO, You're Not Eligible for Driving!");
        }
    }
}

