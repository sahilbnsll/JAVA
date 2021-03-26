package mypakage;
class test{
	public String s="public";
	private int a=20;
	int c=10;
	protected String b="protected";
	void msg() {
		System.out.println("Variable   " + "s: " + s +" a: "+ a +" c: "+ c +" b: "+b);
	}
		}
class check extends test{
	void msg() {
		System.out.println("Variables are "+"s: "+ s +" c: "+ c +" b: "+ b);
		System.out.println("variable a is Private and it is not accessible outside of class");
	}
}

public class AccessM {

	public static void main(String[] args) {
		test obj = new test();
		obj.msg();
		obj = new check();
		obj.msg();
		
	}

}

