package hackerrank;

import java.util.Scanner;

public class MinMaxArr 
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String strArr[] = sc.nextLine().trim().split("\\s+");
		int arr[] = new int[strArr.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(strArr[i]);
		}
		/*
		 * for (int i : arr) { System.out.println(i); }
		 */
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		System.out.println("Min : " + min + " , Max : " + max);
	}

}
