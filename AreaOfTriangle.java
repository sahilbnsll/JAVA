import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args)
    {
        System.out.print("Enter the Height of a Triangle:");
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        System.out.print("Enter the breadth of a Triangle:");
        float breadth = sc.nextFloat();
        double area= (breadth*height)/2;
        System.out.println("Area of Triangle is:"+ area);
    }
}
