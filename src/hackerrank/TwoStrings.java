package hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TwoStrings 
{

	public static Scanner sc = new Scanner(System.in);
	
	public static String isSubstring(String s1, String s2)
	{
		HashMap<Character, Boolean> hashmap = new HashMap<Character, Boolean>();
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		boolean flag = false;
		for (char letter : str1)
		{
			if (!hashmap.containsKey(letter))
			{
				hashmap.put(letter, true);
			}
		}
		for (char letter : str2)
		{
			if (hashmap.containsKey(letter))
			{
				flag = true;
			}
		}
		if (flag)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		int t = sc.nextInt();
		sc.nextLine();
		for (int test = 0; test < t; t++)
		{
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println(isSubstring(str1, str2));
		}
		sc.close();
	}

}
