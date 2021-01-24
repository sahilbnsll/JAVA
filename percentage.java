import java.sql.SQLOutput;
import java.util.Scanner;
class percentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of-");   //edit out of marks
        int x=sc.nextInt();
        System.out.println("Enter marks in Subject 1-");
        int a=sc.nextInt();
        System.out.println("Enter marks in Subject 2-");
        int b=sc.nextInt();
        System.out.println("Enter marks in Subject 3-");
        int c=sc.nextInt();
        System.out.println("Enter marks in Subject 4-");
        int d=sc.nextInt();
        System.out.println("Enter marks in Subject 5-");
        int e=sc.nextInt();
        int max=5*x;    //change no. of subject here. Ex. if 6 then change 5 to 6
        int perc=(a+b+c+d+e)*100/max;
        System.out.println("final percentage is "+perc);
    }
}
