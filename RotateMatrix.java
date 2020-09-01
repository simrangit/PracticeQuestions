
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 } }; 
		
		RotateMatrix(arr);
		
		PrintMatrix(arr);

	}
	
	public static void RotateMatrix(int[][] a)
	{
		int n = a.length;
		for(int i = 0; i < n/2; i++)
		{
			for(int j = 0; j < n-i-1; i++)
			{
				int temp = a[i][j];
				
				// swap elements of each cycle in each iteration
				a[i][j] = a[n - 1 - j][i]; 
	            a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j]; 
	            a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i]; 
	            a[j][n - 1 - i] = temp; 
				
			}
		}
	}
	
	public static void PrintMatrix(int[][] a)
	{
		int n = a.length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
	}

}
