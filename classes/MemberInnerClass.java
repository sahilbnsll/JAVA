package mypakage;

class MemberInnerClass{
int data=24;
 class Inner{
  void msg(){System.out.println(data);
  }
 }
 
 void show(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[])
 {
 MemberInner obj=new MemberInner();
  obj.show();
 }
}

