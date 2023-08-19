package QuickSort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, op, i, j;
		System.out.println("Enter the number of elements in the array");
		n = sc.nextInt();
		int array[] = new int[n];
		QuickSort obj = new QuickSort();
		Random ran = new Random();
		while(true)
		{
			System.out.println("Enter1.Best Case\n2.Average Case\n3.Worst Case\n4.Exit");
			op = sc.nextInt();
			switch(op)
			{
				case 1 :
						for(i=0; i<n;i++)
							array[i]=ran.nextInt();
						long start = System.nanoTime();
						obj.quicksort(array, 0, n-1);
						long stop = System.nanoTime();
						System.out.println("Best Case : "+(stop-start));
						//break;
				case 2 :
						for(i=0; i<n;i++)
							array[i]=ran.nextInt();
						start = System.nanoTime();
						obj.quicksort(array, 0, n-1);
						stop = System.nanoTime();
						System.out.println("Average Case : "+(stop-start));
				case 3 :
						j=n-1;
						for(i=0; i<n;i++)
							array[i]=j--;
						start = System.nanoTime();
						obj.quicksort(array, 0, n-1);
						stop = System.nanoTime();
						System.out.println("Worst Case : "+(stop-start));
						
				default : System.exit(0);	
						
			}
		}
	}

}
