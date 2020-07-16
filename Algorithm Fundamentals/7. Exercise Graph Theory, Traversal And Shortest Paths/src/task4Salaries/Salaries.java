package task4Salaries;

import java.util.*;

public class Salaries {

    public static List<List<Integer>> graph = new ArrayList<>();
    // For each node store its current sum of salaries of each employee
    public static int[] salaries;
    // For each node store if it was visited
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employees = Integer.parseInt(scanner.nextLine());

        salaries = new int[employees];
        visited = new boolean[employees];

        // Stores how many managers are there for each employee
        int[] managersCount = new int[employees];

        for (int i = 0; i < employees; i++) {
            graph.add(new ArrayList<>());
            String line = scanner.nextLine();
            for (int emp = 0; emp < line.length(); emp++) {
                char letter = line.charAt(emp);
                if(letter == 'Y'){
                    // Count the managers of a given employee
                    managersCount[emp]++;
                    // Add employee to the parent
                    graph.get(i).add(emp);
                }
            }
        }

        System.out.println();
        // Stores each node , which does not have a manager, which is a possible source for a dfs
        List<Integer> sources = new ArrayList<>();
        for (int i = 0; i < managersCount.length; i++) {
            if(managersCount[i] == 0){
                sources.add(i);
            }
        }
        for (Integer source : sources) {
            //Call dfs with a big boss, which does not have a manager
            dfs(source);
        }
        int sum = Arrays.stream(salaries)
                .sum();
        System.out.println(sum);
    }

    private static void dfs(int node) {
        if(visited[node]){
            return;
        }

        visited[node] = true;

        for(Integer child : graph.get(node)){
            if(!visited[child]){
                dfs(child);
                // When returning from recursion get the salary for employee, which was set for it in salaries
                int sum = graph.get(child).stream()
                            .mapToInt(c -> salaries[c])
                            .sum();
                // If sum is 0 this employee is not a manager an its salary becomes 1 otherwise the sum
                salaries[child] = sum == 0 ? 1 : sum;
            }
        }

        //If the node is not a manager of anyone, get the sum of each employee below them and write it in salaries
        int sum = graph.get(node).stream()
                .mapToInt(c -> salaries[c])
                .sum();
        salaries[node] = sum == 0 ? 1 : sum;

    }
}

























