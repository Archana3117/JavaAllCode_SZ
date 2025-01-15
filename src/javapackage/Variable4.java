package javapackage;

public class Variable4 {
	public static void main(String[] args) {
		
	
	
	int a[]= {1,2,3,4,5,6,7,100};

	String s[]= {"John","Peter"};
	
	
	
	System.out.println(a[1]); //2
	System.out.println(a[3]); //4
	System.out.println(a[2]); //3
	System.out.println(a[7]); //100
	
	
	
	Object obj[]= {1,2,3,"john","Peter",10.5,true,'a','b',3>12};
	
	System.out.println(obj[2]); //3
	System.out.println(obj[4]); //Peter
	System.out.println(obj[5]); //10.5
	System.out.println(obj[7]);
	System.out.println(obj[9]);
}
}