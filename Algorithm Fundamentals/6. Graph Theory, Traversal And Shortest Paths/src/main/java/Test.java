import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static class Graph{
        int source;
        List<Edge> edges;

        public Graph(int source){
            this.source = source;
            this.edges = new ArrayList();
        }
    }

    // Represent with Edge class
    public static class Edge{
        int source;
        int destination;
        public Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }

    }
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).addAll(Arrays.asList(9,8,5));
        graph.get(9).add(1);
        graph.get(8).add(1);
        graph.get(5).add(1);
        graph.get(2).add(10);
        graph.get(3).add(1);

        for(int child : graph.get(1)){
            System.out.println("Child Node of 1 : " + child);
        }
        for(int child : graph.get(9)){
            System.out.println("child of 9 : " + child);
        }

        // represent as a matrix
        int nodes = 10;
        int[][] graphAsMatrix = new int[nodes + 1][nodes + 1];
        graphAsMatrix[10][10] = 1;

        //  represent with an Edge class
        List<Edge> graphEdge = new ArrayList<>();
        graphEdge.add(new Edge(1,2));
        graphEdge.add(new Edge(1,3));
        graphEdge.add(new Edge(1,4));
        graphEdge.add(new Edge(1,5));
        graphEdge.add(new Edge(1,6));


        //  represent as a Graph class
        List<Graph> graphs = new ArrayList<>();
        Graph graph1 = new Graph(1);
        graph1.edges.add(new Edge(1,2));

        // represent with weighted graph
        int[][] matrixWeight = new int[3][3];
        matrixWeight[1][2] = 12;
    }
}













