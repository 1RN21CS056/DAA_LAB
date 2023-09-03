package Dijkstra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Vertices");
        int n = sc.nextInt();

        int adj[][] = new int[n][n];

        System.out.println("Enter Adjacency Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Source vertex");
        int src = sc.nextInt();
        int[] dist = dijkstra(adj, src);
        for (int i = 0; i < n; i++) {
            if (src == i) {
                continue;
            }
            System.out.println("Shortest Distance from " + src + " to " + i + " is " + dist[i]);
        }
    }

    static int[] dijkstra(int adj[][], int src) {
        int n = adj.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[src] = 0;

        for (int i = 0; i < n - 1; i++) {

            int min_dist = Integer.MAX_VALUE;
            int unvis = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && dist[j] < min_dist) {
                    unvis = j;
                    min_dist = dist[j];
                }
            }

            visited[unvis] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && adj[unvis][v] != 0 && dist[unvis] != Integer.MAX_VALUE &&
                    dist[unvis] + adj[unvis][v] < dist[v]) {
                    dist[v] = dist[unvis] + adj[unvis][v];
                }
            }
        }

        return dist;
    }
}
