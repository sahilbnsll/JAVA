package mypakage;
class UncheckedE{  
	   public static void main(String args[]) {
		try{
		   int arr[] ={1,2,3,4,5};
		   System.out.println(arr[9]);
		}
	        catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("The specified index does not exist. In array, Please correct the error.");
		}
	   }
	}
