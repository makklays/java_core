import java.util.*;

/**
 * Algotithm Dijkstra (with PriorityQueue)
 *
 * O(E log V)
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 04-02-2026
 * @version 0.0.1
 */
public class DijkstraPQ {

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int start) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        // [vertex, distance]
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int currentDist = current[1];

            // пропускаем устаревшие значения
            if (currentDist > dist[u]) continue;

            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        printResult(dist);
    }

    private static void printResult(int[] dist) {
        System.out.println("Vertex \t Distance from source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // граф неориентированный
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 5));

        graph.get(1).add(new Edge(0, 10));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(4, 2));

        graph.get(2).add(new Edge(1, 1));
        graph.get(2).add(new Edge(3, 4));

        graph.get(3).add(new Edge(2, 4));
        graph.get(3).add(new Edge(4, 3));

        graph.get(4).add(new Edge(0, 5));
        graph.get(4).add(new Edge(1, 2));
        graph.get(4).add(new Edge(3, 3));

        dijkstra(graph, 0);
    }
}


