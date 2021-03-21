package mypakage;
public class LocalInnerClass{
	 int data=24;
	 void show()
	 {
	  class Local
	  {
	   void msg()
	   {
		   System.out.println(data);
		   }
	  }
	  Local S=new Local();
	  S.msg();
	 }
	 public static void main(String args[]){
	  LocalInner1 obj=new LocalInner1();
	  obj.show();
	 }
	}

