package hackerrank;

import java.util.Scanner;

public class ZombiesInCity 
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int noOfCities = sc.nextInt();
		sc.nextLine();
		String strArr[] = sc.nextLine().trim().split("\\s+");
		int arr[] = new int[noOfCities];
		for (int i = 0; i < noOfCities; i++)
		{
			arr[i] = Integer.parseInt(strArr[i]);
		}
		magicalAndGoodCityCount(arr, noOfCities);
	}

	private static void magicalAndGoodCityCount(int arr[], int length) {
		// TODO Auto-generated method stub
		for (int i = 0; i < length - 1; i++)
		{
			if (arr[i] > arr[i + 1] && gcd(i, i + 1))
			{
				System.out.println(arr[i]);
			}
		}
	}

	private static boolean gcd(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		int gcd = 1;
		int min = Math.min(num1, num2);
		for (int i = 2; i < min; i++)
		{
			if ( (num1 % i) == 0 && (num2 % i) == 0)
			{
				gcd = i;
				break;
			}
		}
		if (gcd == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
