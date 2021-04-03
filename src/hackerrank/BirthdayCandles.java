package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class BirthdayCandles 
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int length = sc.nextInt();
		sc.nextLine();
		String heights[] = sc.nextLine().trim().split("\\s+");
		int candleHeights[] = new int[length];
		for (int i = 0; i < length; i++)
		{
			candleHeights[i] = Integer.parseInt(heights[i]);
		}
		System.out.println(maxHeightCandles(candleHeights));
	}

	private static int maxHeightCandles(int heights[]) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < heights.length; i++)
		{
			if (hashmap.containsKey(heights[i]))
			{
				int value = hashmap.get(heights[i]);
				hashmap.put(heights[i], ++value);
			}
			else
			{
				hashmap.put(heights[i], 1);
			}
			if (heights[i] > max)
			{
				max = heights[i];
			}
		}
		return hashmap.get(max);
	}

}
