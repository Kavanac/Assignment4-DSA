
import java.util.*;
import java.io.*;

public class Question6 {
	
	public static void sortSquares(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];

		Arrays.sort(arr);
	}

	public static void main(String[] args)
	{
		int arr[] = {-4,-1,0,3,10 };
		int n = arr.length;

		System.out.println("Before sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		sortSquares(arr);
		System.out.println("");
		System.out.println("After Sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
