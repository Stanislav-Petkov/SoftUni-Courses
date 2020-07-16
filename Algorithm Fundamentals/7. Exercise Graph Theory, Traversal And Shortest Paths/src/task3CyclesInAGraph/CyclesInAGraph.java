package task3CyclesInAGraph;

import java.util.*;

public class CyclesInAGraph {
    public static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String source = null;
        while (!line.equals("End")) {
            String[] tokens = line.split("-");

            if (source == null) {
                source = tokens[0];
            }
            graph.putIfAbsent(tokens[0], new ArrayList<>());

            graph.get(tokens[0]).add(tokens[1]);

            line = scanner.nextLine();
        }
        System.out.println();
        Set<String> visited = new HashSet<>();
        Set<String> cycles = new HashSet<>();

        try {
            dfs(source, visited, cycles);
            System.out.println("Acyclic: Yes");
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void dfs(String source, Set<String> visited, Set<String> cycles) {
        if (cycles.contains(source)) {
            throw new IllegalStateException("Acyclic: No");
        }
        if (visited.contains(source)) {
            return;
        }

        cycles.add(source);
        visited.add(source);
        List<String> children = graph.get(source);

        if(children == null){
            return;
        }
        // Get all children
        for (String child : children) {
            dfs(child, visited, cycles);
        }
        cycles.remove(source);
    }
}
