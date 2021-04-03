package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MinSwaps 
{
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*
	 * Question 
	 * 1 3 5 2 4 6 7 
	 * track = [1,2,3,4,5,6,7]
	 * Cycles 
	 * 1 			0 
	 * 3-5-4-2 		3 
	 * 6 			0 
	 * 7 			0
	 * 				3	SUM
	 */

	public static int minimumSwaps(int array[]) 
	{
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		int length,b,swaps = 0;
		for (int i = 0; i < array.length; i++) 
		{
			visited.put(i + 1, false);
		}
		for (int i = 0; i < array.length; i++) 
		{
			if (!visited.get(array[i])) 
			{
				length = 1;
				b = array[i] - 1;
				visited.put(array[i], true);
				while (b != i) 
				{
					visited.put(array[b], true);
					b = array[b] - 1;
					length++;
				}
				swaps += (length - 1);
			}
		}
		return swaps;
	}

	public static void main(String[] args) throws IOException 
	{
		int n = Integer.parseInt(br.readLine());
		String str_arr[] = br.readLine().trim().split("\\s+");
		int arr[] = new int[n];
		for (int i = 0; i < str_arr.length; i++) 
		{
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		System.out.println(minimumSwaps(arr));
	}

}
