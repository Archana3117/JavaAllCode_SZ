package javapackage;

public class Array1 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		System.out.println(a.length);
	

	//print default value of an array 
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	//assigning value to array
	a[0]=1;
	a[1]=11;
	a[2]=111;
	a[3]=1111;
	a[4]=11111;
	
	System.out.println(a[4]);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}