import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args)
    {
        System.out.print("Enter the lenght of a rectangle:");
        Scanner sc = new Scanner(System.in);
        float lenght = sc.nextFloat();
        System.out.print("Enter the breadth of a rectangle:");
        float breadth = sc.nextFloat();
        double area= (breadth*lenght);
        System.out.println("Area of rectangle is:"+ area);
    }
}
