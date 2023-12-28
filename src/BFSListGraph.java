import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSListGraph {
    static List<List<Integer>> adj;
    static boolean[] visited;

    static int[] distance;
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
        bfs(0);
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] =true;
        queue.add(start);
        while (!queue.isEmpty()){
            int next = queue.poll();
            System.out.println(next + " ");
            for(int target : adj.get(next)){
                if(visited[target]!=true){
                    visited[target] =true;
                    queue.add(target);
                }
            }
        }
    }
    static void addEdge(int start, int end) {
        adj.get(start).add(end);
        adj.get(end).add(start);
    }

}
