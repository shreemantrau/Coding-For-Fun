package practice2;

import java.util.Scanner;

public class saddle_point 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		
		//def a matrix
		int [][]matrix=new int[rows][col];
		
		//taking input in the matrix
		System.out.println("Please enter the elements in the matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
				
			}
		}
		
		//printing the matrix
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}		
		
		
		saddle_point sp=new saddle_point();
		sp.finding_saddle_point(matrix);
		
	}//end of main
	
	public void finding_saddle_point(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			boolean answer=true;
			int min=matrix[i][0];
			int colref=0;
			
			//finding the minimum element in the row 
			for(int j=1;j<matrix[i].length;j++)
			{
				if(matrix[i][j]<min)
				{
					min=matrix[i][j];
					colref=j;
				}
			}
			
			
			//checking if the minimum element in the row is also the highest in the column
			for(int p=0;p<matrix.length;p++)
			{
				if(matrix[p][colref]>min)
				{
					answer=false;
					break;
				}
			}//loop checking for saddle point
			
			if(answer==true)
			{
				System.out.println("The saddle point of the element is: "+min);
			}
		}//end of first for loop
	}

}
