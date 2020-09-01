
public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = { { 0, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 0, 11, 12 }, 
                { 13, 14, 15, 16 } }; 
		
		int m = matrix.length; // rows
		int n = matrix[0].length; // columns
		
		try
		{
			setZeroes(matrix, m , n);
			printMatrix(matrix, m, n);
		}
		catch(Exception e)
		{
			System.out.println("Error message "+e.getMessage());
		}
		
	}
	
	public static void setZeroes( int[][] matrix, int m, int n )
	{
		boolean[] row = new boolean[m];
		boolean[] column = new boolean[n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
					
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			if(row[i])
				nullifyRow(matrix, i);
		}
		
		for(int j = 0; j < n; j++)
		{
			if(column[j])
				nullifyColumn(matrix, j);
		}
	}
	
	public static void nullifyRow(int[][] matrix, int row)
	{
		for(int j = 0; j < matrix.length; j++)
		{
			matrix[row][j] = 0;
		}
	}
	
	public static void nullifyColumn(int[][] matrix, int column)
	{
		for(int i = 0; i < matrix[0].length; i++)
		{
			matrix[i][column] = 0;
		}
	}
	
	public static void printMatrix(int[][] matrix, int m, int n)
	{
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
	}

}
