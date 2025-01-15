package javapackage;

public class Variable8 {

	
	int a=5;
	
	static int h=3;
	
	
	
	public static void b()
	{
		int c=6;
		System.out.println(c);
	}
	
	public void f()
	{
		int e=8;
		System.out.println(e);
	}
	public static void main(String[] args) {
   
		
		int d=4;
		System.out.println(d);
		
		b(); //6
		System.out.println(h); //3
		
		Variable8 v=new Variable8();
		v.f(); //8
		System.out.println(v.a); //a
		
		
	}

}
