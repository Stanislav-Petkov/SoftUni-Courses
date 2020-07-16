package task1DistanceBetweenVertices;

import java.util.*;

public class DistanceBetweenVertices {
    // Adjacency matrix
    public static int[][] graph;

    // Used to map the value of the node to an ordered index from 0 to the graph length
    public static Map<Integer, Integer> indexMapper = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodes = Integer.parseInt(scanner.nextLine());
        int pairs = Integer.parseInt(scanner.nextLine());

        graph = new int[nodes + 1][];

        for (int i = 1; i <= nodes; i++) {
            String[] edges = scanner.nextLine()
                    .split(":");

            // for every graph key , set its map key to be its index
            indexMapper.put(Integer.parseInt(edges[0]),i);

            if (edges.length == 1) {
                graph[i] = new int[0];
            } else {
                graph[i] = Arrays.stream(edges[1].split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
        }

        while (pairs-- > 0) {
            int[] relations = Arrays.stream(scanner.nextLine().split("-"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int source = relations[0];
            int dest = relations[1];

            System.out.printf("{%d, %d} -> ", source, dest);

            // Holds number of steps from source to destination
            int[] prev = new int[graph.length];
            // Fill the array with -1
            Arrays.fill(prev, -1);
            int sourceIndexValue = indexMapper.get(source);
            int destIndexValue = indexMapper.get(dest);
            // call bfs with the mapped index and not with the real node value
            bfs(graph,sourceIndexValue,destIndexValue, prev);

            List<Integer> path = new ArrayList<>();

            // Search for the path from the dest to the source
            int parent = prev[indexMapper.get(dest)];

            while (parent != -1) {
                path.add(parent);
                parent = prev[parent];
            }

            int size = path.isEmpty() ? -1 : path.size();

            System.out.println(size);
        }
    }

    private static void bfs(int[][] graph, int source, int dest, int[] prev) {

        Deque<Integer> queue = new ArrayDeque<>();
        // Start from the source
        queue.offer(source);

        // We should go through each node only once and check if it was visited starting from 1 and not 0
        boolean[] visited = new boolean[graph.length + 1];
        // Mark source as visited
        visited[source] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            if (node == dest) {
                return;
            }
            // Iterate through every child
            for (int i = 0; i < graph[node].length; i++) {
                int child = indexMapper.get(graph[node][i]);
                if (!visited[child]) {
                    // On the child's position write the parent's node
                    prev[child] = node;
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
        // If there was no return, the destination was not reached, this means that there was no such prev
        prev[source] = -1;
    }

}

























