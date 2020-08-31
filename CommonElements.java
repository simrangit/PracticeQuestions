import java.util.*;
/*
The program checks whether one array contains elements of another array
*/
public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// can also use hashtable to store an element with a count, and check if count>1, then its a common element

		int a[] = {13, 27, 35, 40, 49, 55, 59};
		int b[] = {17, 35, 39, 40, 55, 58, 60};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < a.length; i++)
			hs.add(a[i]);
		
		System.out.println(" "+hs);
		
		for(int i = 0; i < b.length; i++)
		{
			if(hs.contains(b[i]) == true)
				System.out.println(" "+b[i]);
		}
		
		// run-time is O(n)
		
	}

}
