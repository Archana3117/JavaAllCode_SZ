package javapackage;

public class Static3 {
	
	int roll;
	String name;
	static String college="IIT Bombay";
	
	Static3(int r,String n)
	{
		
		roll=r;
		name=n;
		college=n;
	}
	
   public void getMethod()
   {
	   System.out.println(roll+" "+name+" "+college);
   }

}
