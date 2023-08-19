package Knapsack;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w[], p[], index[], sum = 0;
        System.out.println("Enter number of entries");
        int n = sc.nextInt();
        w = new double[n];
        p = new double[n];
        index = new double[n];
        System.out.println("Enter weight and profit of products");
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble();
            p[i] = sc.nextDouble();
            index[i] = i;
        }
        Knapsack ob = new Knapsack();
        double sol[] = ob.maxprofit(w, p, index);
        System.out.println("Solution vector is:");
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if (i == index[j]) {
                    System.out.print(sol[j] + "  ");
                    if (sol[j] > 0)
                        sum += sol[j] * p[j];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Profit:" + sum);
    }
}
