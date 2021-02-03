import java.util.Scanner;
public class CgpaCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of-");   //edit out of marks
        float x=sc.nextFloat();
        System.out.println("Enter marks in Subject 1-");
        float a=sc.nextFloat();
        System.out.println("Enter marks in Subject 2-");
        float b=sc.nextFloat();
        System.out.println("Enter marks in Subject 3-");
        float c=sc.nextFloat();
        System.out.println("Enter marks in Subject 4-");
        float d=sc.nextFloat();
        System.out.println("Enter marks in Subject 5-");
        float e=sc.nextFloat();
        float max=5*x;    //change no. of subject here. Ex. if 6 then change 5 to 6
        float cgpa=(a+b+c+d+e)*10/max;
        System.out.println("final CGPA is "+ cgpa);
    }
}

