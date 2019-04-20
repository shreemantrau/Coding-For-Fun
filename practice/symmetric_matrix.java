package practice2;

import java.util.Scanner;

public class symmetric_matrix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns");
		int c=sc.nextInt();
		if(r!=c)
		{
			System.out.println("It is not a symmetrix matrix");
		}
		//taking input
		int[][]matrix=new int[r][c];
		System.out.println("Please enter the elements in your matrix");
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		//printing the matrix
		System.out.println("Displaying the matrix which you have entered");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		boolean symmetric=true;
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(matrix[i][j]!=matrix[j][i])
				{
					symmetric=false;
					break;
				}
			}
		}
		
		if(symmetric==true)
		{
			System.out.println("The matrix which you have enterd is symmetric");
		}
		
		else
		{
			System.out.println("The matric is not symmetric.");
		}
		
	}//end of main
}
