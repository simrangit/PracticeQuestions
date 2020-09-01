
public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = { { 0, 2, 3, 4, 12 }, 
                { 5, 6, 7, 8, 87 }, 
                { 9, 0, 11, 12, 9 }, 
                { 13, 14, 15, 16, 11 } }; 
		
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
		
		// nullify Rows
		for(int i = 0; i < row.length; i++)
		{
			if(row[i])
				nullifyRow(matrix, i);
		}
		
		//  nullify Columns
		for(int j = 0; j < column.length; j++)
		{
			if(column[j])
				nullifyColumn(matrix, j);
		}
	}
	
	public static void nullifyRow(int[][] matrix, int row)
	{
		for(int j = 0; j < matrix[0].length; j++)
		{
			matrix[row][j] = 0;
		}
	}
	
	public static void nullifyColumn(int[][] matrix, int column)
	{
		for(int i = 0; i < matrix.length; i++)
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
