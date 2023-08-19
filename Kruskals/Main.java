package Kruskals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int adj[][] = new int[10][10];
		int i, j;
		System.out.println("Enter the number of vertices of the graph");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the wieghted matrix");
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				adj[i][j] = sc.nextInt();
		Kruskals k = new Kruskals();
		k.krkl(adj, n);
		

	}

}