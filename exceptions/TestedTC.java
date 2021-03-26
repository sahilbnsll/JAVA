package mypakage;
import java.io.*;

public class NestedTC {
	
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Divide");
				int a=18/0;
			}
			catch(ArithmeticException e)
			{
			System.out.println(e);
		}
			try {
				int a[]=new int[5];
				a[6]=2;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("other statements");
	}
		
		catch(Exception e)
		{
			System.out.println("handled");
		}
		finally {
			System.out.println("finally is always print");
		}
		
	}
}



