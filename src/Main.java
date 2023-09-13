import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		boolean[] key = new boolean[256];
		Arrays.fill(key,false);
		
		System.out.println(ContainsDuplicate("String", key));
		
		System.out.println(ContainsDuplicate("Array", key));
	}
	public static boolean ContainsDuplicate(String s, boolean[] key)
	{
		for(int i =0; i<s.length(); i++)
		{
			if(key[(int)s.charAt(i)])
			{
				return true;
			}
			else
			{
				key[(int)s.charAt(i)] = true;
			}
		}
		return false;
	}

}
