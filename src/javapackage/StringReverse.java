package javapackage;

public class StringReverse {

	public static void main(String[] args) {

		String s="Archana";
		String rev="";
		
		for(int i=s.length() - 1;i>=0;i--)
		{
			rev+= rev.charAt(i);
		}
		System.out.println(rev);
	}

}
