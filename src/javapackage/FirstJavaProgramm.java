package javapackage;

public class FirstJavaProgramm {
	
	
	int a=5;
	public static int c=5;
	
	public static void main(String[] args) {
		
		System.out.println("Archana");
		System.out.println("mahajan");
		aMethod();
		bMethod();
		int b=5;
		System.out.println(b);  //5
		
	}
	//user definded method
	public static void aMethod()
	{
		System.out.println("hello aMethod");
	}

	
	//user defined method
	public  static void bMethod()
	{
		int d=5;    //local variable
	  System.out.println(d);  //calling a variable
	}
}
