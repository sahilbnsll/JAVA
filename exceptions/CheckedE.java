package mypakage;
import java.io.*;
public class CheckedE {  
   public static void main(String args[])
   {
	FileInputStream file = null;
	try{
	    file = new FileInputStream("E:/Myfile.txt"); 
	}catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not present at the given path");
	 }
	int k; 
	try{
	    while(( k = file.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    file.close(); 
	}catch(IOException io){
	    System.out.println("I/O error occurred: "+io);
	 }
   }
}
