
public class DivideAndReduceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "12345678910";
		
		int k = 3; // each divided string will be of length 3
		
		String group_length = new String();
		
		for(int i = 0; i < k; i++)
			group_length = group_length + ".";
		
		try
		{
			String str = DivideAndReduce( s, k, group_length);
			System.out.println("Final String is "+str);
		}
		catch(Exception e)
		{
			System.out.println("Error Message "+e.getMessage());
		}
		
	}
	
	public static String DivideAndReduce( String s, int k, String group_length)
	{
		int n = s.length();
		
		if(k>=n)
			return s;
		
		String final_string = new String();
		
		String[] arr = java.util.Arrays.toString(s.split("(?<=\\G"+group_length+")")).replace("[","").replace(" ","").replace("]", "").split(",");
		
		System.out.println("it is "+arr[0]);
		for(String str: arr)
		{
			int num = Integer.valueOf(str);
			
			int sum = getSum(num);
			str = Integer.toString(sum);
			
			final_string = final_string + str;
			
		}
		
		//System.out.println("before passing "+final_string);
		return DivideAndReduce(final_string, k, group_length);
	}
	
	public static int getSum(int num)
	{
		int sum = 0; 
        
        while (num != 0) 
        { 
            sum = sum + num % 10; 
            num = num/10; 
        } 
      
    return sum; 
	}

}
