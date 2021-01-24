package com.company;
import java.util.Scanner; //here we import scanner class
public class sum          //Class name must be same as filename and must follow Pascal naming convention
{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number 1-");
        int a=sc.nextInt();
        System.out.println("Enter number 2-");
        int b=sc.nextInt();
        int sum = a + b;
        System.out.println("sum of these two number is "+sum);
    }
}



