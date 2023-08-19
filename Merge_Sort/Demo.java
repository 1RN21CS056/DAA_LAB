package Merge_Sort;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        mergesort ob = new mergesort();

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;

        while (true) {
            System.out.println("Enter 1=best 2=avg 3=worst 4=exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (i = 0; i < n; i++)
                        a[i] = i;
                    break;
                case 2:
                    for (i = 0; i < n; i++)
                        a[i] = R.nextInt(n);
                    break;
                case 3:
                    for (i = 0; i < n; i++)
                        a[i] = n - i - 1;
                    break;
                case 4:
                    System.exit(0);
            }

            long start, stop, elapsed;
            start = System.nanoTime();
            ob.mergeSort(a, 0, n - 1);
            stop = System.nanoTime();
            elapsed = stop - start;
            System.out.println("Time: " + elapsed + " ns");
        }
    }
}
