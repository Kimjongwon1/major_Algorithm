import java.util.*;

public class FarNode {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int[][] input = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2},{2,4},{5,2}};
        int n = 6;
        visited = new boolean[n + 1];
        distance = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] a : input) {
            addEdge(a[0], a[1]);
        }

        bfs(1);

        int maxDistance = Arrays.stream(distance).max().getAsInt();
        long farthestNodeCount = Arrays.stream(distance).filter(d -> d == maxDistance).count();
        System.out.println("Return " + farthestNodeCount);
    }

    static void addEdge(int a, int b) {
        list.get(a).add(b);
        list.get(b).add(a);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : list.get(now)) {
                if (!visited[next]) {
                    queue.add(next);
                    distance[next] = distance[now] + 1;
                    visited[next] = true;
                }
            }
        }
    }
}
