
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbcccccdddd";
		
		System.out.println("The final string is "+compress(str));
	}
	
	public static String compress(String str)
	{
		StringBuilder output = new StringBuilder();
		
		int count = 1;
		
		for(int i = 0; i < str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				count++;
			}
			else
			{
				output.append(str.charAt(i));
				output.append(count);
				
				count = 1;
			}
		}
		
		output.append(str.charAt(str.length()-1));
		output.append(count);
		
		return (output.length() < str.length() ? output.toString() : str);
	}

}
