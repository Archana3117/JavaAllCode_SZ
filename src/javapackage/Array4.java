package javapackage;

public class Array4 {

	public static void main(String[] args) {

		// multidimantional array

		int a[][] = { { 1, 2, 3, 4 }, { 10, 20, 30, 40, }, { 11, 22, 33, 44 } };

		// total no of rows
		int row = a.length;
		System.out.println(row);

		// total no of rows
		int colms = a[0].length;
		System.out.println(colms);
		
		for(int i=0;i< row;i++)
		{
			for(int j=0;j<colms;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
