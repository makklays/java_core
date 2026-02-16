import java.util.Arrays;

/**
 * Algotithm Dijkstra
 *
 * Time Complexity = O(V²)
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 03-02-2026
 * @version 0.0.1
 */
public class DijkstraSimple {

    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v]
                        && graph[u][v] != 0
                        && dist[u] != INF
                        && dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printResult(dist);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int index = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                index = i;
            }
        }
        return index;
    }

    private static void printResult(int[] dist) {
        System.out.println("Vertex \t Distance from source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 0, 0, 5},
                {10, 0, 1, 0, 2},
                {0, 1, 0, 4, 0},
                {0, 0, 4, 0, 3},
                {5, 2, 0, 3, 0}
        };

        dijkstra(graph, 0);
    }
}

