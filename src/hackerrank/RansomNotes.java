package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNotes 
{
	public static Scanner sc = new Scanner(System.in);
	
	static void checkMagazine(String[] m, String[] n) 
	{
		int count;
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		for (String magzine_word : m) 
		{
			if (hashmap.containsKey(magzine_word)) 
			{
				count = hashmap.get(magzine_word);
				hashmap.put(magzine_word, ++count);
			} 
			else 
			{
				hashmap.put(magzine_word, 1);
			}
		}
		for (String note_word : n) 
		{
			if (hashmap.containsKey(note_word)) 
			{
				count = hashmap.get(note_word);
				hashmap.put(note_word, --count);
				if (hashmap.get(note_word) == 0) 
				{
					hashmap.remove(note_word);
				}
			} 
			else 
			{
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	public static void main(String[] args)
	{
		String[] magazine = sc.nextLine().trim().split("\\s+");
		String[] note = sc.nextLine().trim().split("\\s+");
		checkMagazine(magazine, note);
	}

}
