

import java.util.Arrays;

public class Question8 {
	
	static void shuffleArray(int a[], int n)
	{
		for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
			for (int j = k; j > i + q; j--) {
				
				int temp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = temp;
			}
	}

	
	public static void main(String[] args)
	{
		int a[] = {2,5,1,3,4,7 };

		shuffleArray(a, a.length / 2);

		System.out.println(Arrays.toString(a));
	}
}
