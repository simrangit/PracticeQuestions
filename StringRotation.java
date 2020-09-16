/*
 * the program checks whether a string is a rotation of another string or not.
 * checkRotation -> check using contains method.
 * isRotation -> check rotation without using contains method.
 */

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "simran";
		String rotated = "mransi";
		
		boolean check = false;
		
		try
		{
			check = isRotation(input, rotated);
		}
		catch(Exception e)
		{
			System.out.println("The error message "+e.getMessage());
		}
		
		if(check)
			System.out.println("It is a rotation");
		else
			System.out.println("It is not a rotation");

	}
	
	public static boolean checkRotation(String input, String rotated)
	{
		// check rotation using contains method
		input = input + input;
		
		if(input.contains(rotated)) // 
			return true;
		else
			return false;
	}
	
	public static boolean isRotation(String input, String rotated)
	{
		// check rotation without using contains method
		
		if(input== null || rotated==null)
			return false;
		else if(input.length() != input.length())
			return false;
		
		int index = rotated.indexOf(input.charAt(0));
		
		if(index > -1)
		{
			if (input.equalsIgnoreCase(rotated)) {
                return true;
            }

            int finalPos = rotated.length() - index;
            return rotated.charAt(0) == input.charAt(finalPos)
                    && input.substring(finalPos).equals(rotated.substring(0, index));
		}
				
		return false;
	}

}
