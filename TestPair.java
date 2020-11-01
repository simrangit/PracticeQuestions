import java.util.HashSet;
import java.util.Set;

public class TestPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this program find pairs in an array that sum to a given number
		
		int a[] = {1,7,5,9,2,12,3};
		int sum = 2;
		
		printPairsUsingSet(a,sum);
	}
	
	public static void printPairsUsingSet(int[] numbers, int n)
	{ 
		if(numbers.length < 2)
			{ 
				return; 
			} 
		Set<Integer> set = new HashSet(numbers.length); 
		for(int i = 0; i < numbers.length; i++)
			{ 
				int target = numbers[i] - n; // if target number is not in set then add 
				
				if(!set.contains(target))
					{ 
						set.add(numbers[i]); 
					}
				else 
					{ 
						System.out.printf("(%d, %d) %n", numbers[i], target); 
					} 
			} 
	}	
}

