import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSListGraph {
    static List<List<Integer>> adj;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] inputArr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        int node_n = 5;
        int start = 0;
        visited = new boolean[node_n];
        adj = new ArrayList<>();
        for (int i = 0; i < node_n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] a : inputArr) {
            addEdge(a[0], a[1]);
        }
        dfsL(start);
    }

    static void addEdge(int start, int end) {
        adj.get(start).add(end);
        adj.get(end).add(start);
    }

    static void dfsL(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < adj.size(); i++) {
            if (i == start) {
                for (int j = 0; j < adj.get(i).size(); j++) {
                    int connectedNode = adj.get(i).get(j);
                    if (!visited[connectedNode]) {
                        dfsL(connectedNode);
                    }
                }
            }
        }
    }
}
//import java.util.ArrayList;
//import java.util.List;
//
//public class DFSListGraph {
//    static List<List<Integer>> adj;
//    static boolean[] visited;
//
//    public static void main(String[] args) {
//        int[][] inputArr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
//        int node_n = 5;
//        int start = 0;
//        visited = new boolean[node_n];
//        adj = new ArrayList<>();
//        for (int i = 0; i < node_n; i++) {
//            adj.add(new ArrayList<>());
//        }
//        for (int[] a : inputArr) {
//            addEdge(a[0], a[1]);
//        }
//        dfsL(start);
//    }
//
//    static void addEdge(int start, int end) {
//        adj.get(start).add(end);
//        adj.get(end).add(start);
//    }
//
//    static void dfsL(int start) {
//        visited[start] = true;
//        System.out.print(start + " ");
//        for (int i : adj.get(start)) {
//            if (!visited[i]) {
//                dfsL(i);
//            }
//        }
//    }
//}
