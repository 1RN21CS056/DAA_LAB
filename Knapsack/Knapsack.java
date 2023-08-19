package Knapsack;

import java.util.Scanner;

public class Knapsack {
    public static void sort(double w[], double p[], double index[]) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w.length - 1; j++) {
                if (p[j] / w[j] < p[j + 1] / w[j + 1]) {
                    double temp;
                    temp = w[j];
                    w[j] = w[j + 1];
                    w[j + 1] = temp;
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                    temp = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = temp;
                }
            }
        }
    }

    public double[] maxprofit(double w[], double p[], double index[]) {
        Scanner sc = new Scanner(System.in);
        sort(w, p, index);
        int i;
        double sol[] = new double[w.length];
        System.out.println("Enter the capacity");
        double weight = sc.nextDouble();
        for (i = 0; i < w.length; i++) {
            if (w[i] > weight)
                break;
            sol[i] = 1;
            weight = weight - w[i];
        }
        if (w[i] > weight)
            sol[i] = weight / w[i];

        return sol;
    }
}
