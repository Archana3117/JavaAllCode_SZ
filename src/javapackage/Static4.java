package javapackage;

public class Static4 {
	
	public static void main(String[] args) {
		
		Static3 s=new Static3(1, "John");
		Static3 s4=new Static3(2,"Peter");
		Static3 s5=new Static3(3,"Alex");
		
		s.getMethod();
		s4.getMethod();
		s5.getMethod();
	}

}
