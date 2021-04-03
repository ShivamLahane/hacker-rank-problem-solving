package hackerrank;

import java.util.Scanner;

public class MiniMaxSum 
{
	
    private static Scanner sc = new Scanner(System.in);
	
	static void miniMaxSum(long arr[]) 
	{
		int min = 0, max = 0;
		for (int i = 1; i < 5; i++)
		{
			if (arr[i] > arr[max])
			{
				max = i;
			}
			else if (arr[i] < arr[min])
			{
				min = i;
			}
		}
		long sumMax = 0, sumMin = 0;
		for (int i = 0; i < 5; i++)
		{
			if (i != max)
			{
				sumMin += arr[i];
			}
			if (i != min)
			{
				sumMax += arr[i];
			}
		}
		System.out.println(sumMin + " " + sumMax);
	}

	public static void main(String[] args) 
	{
		long arr[] = new long[5];
		String arrItems[] = sc.nextLine().trim().split("\\s+");
		for (int i = 0; i < 5; i++)
		{
			arr[i] = Long.parseLong(arrItems[i]);
		}
		miniMaxSum(arr);
	}	
}

