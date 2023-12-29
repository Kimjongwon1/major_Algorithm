//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class BFSListGraph {
//    static List<List<Integer>> adj;
//    static boolean[] visited;
//
//    static int[] distance;
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
//        bfs(0);
//    }
//    static void bfs(int start){
//        Queue<Integer> queue = new LinkedList<>();
//        visited[start] =true;
//        queue.add(start);
//        while (!queue.isEmpty()){
//            int next = queue.poll();
//            System.out.println(next + " ");
//            for(int target : adj.get(next)){
//                if(visited[target]!=true){
//                    visited[target] =true;
//                    queue.add(target);
//                }
//            }
//        }
//    }
//    static void addEdge(int start, int end) {
//        adj.get(start).add(end);
//        adj.get(end).add(start);
//    }
//
//}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSListGraph {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) {

//        for(int i=1; i<=행의길이; i++) { for(int j=1; j<=열의길이; j++)
//        { // 1) 시작 노드 표현식 : (i-1)*(열의개수)+j
//            // 2) 타겟의 번호와 타겟의 유효성 체크
//            // 2-1) 타겟의 번호 : j에 -1을 빼면 왼쪽, i에 +1하면 오른쪽 등
//            // 2-2) 타겟의 유효성 : i와 j가 상하좌우 길이를 벗어나지 않는지 체크
//            // 위쪽 유효성 체크 if(i-1 >= 1) // 아래쪽 유효성체크 if(i+1 <= 행의길이)
//            // 왼쪽 if(j-1 >= 1)
//            // 오른쪽 if(j+1 <= 열의길이)
//            // 상하좌우 체크 로직 int[]dx = {-1,1,0,0}; int[]dy = {0,0,-1,1}; for(int d=0; d<4; d++)
//            // { int target_i = i+dx[d];
//            // int target_j = j+dy[d];
//            // if(target_i>=1 && target_i<=행의길이 && target_j >=1 && target_j<=열의길이)
//            // { addEdge((i-1)*열의개수+j, (target_i-1)*열의개수+target_j) ; } }
        int[][] input = {{0,1}, {0,2}, {1,3}, {2,3}, {2,4}}; // 단방향
        int n = 5; // 노드 개수
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            list.add(new ArrayList<>()); // 내부 리스트 초기화 -> 연결된 노드
        }
        for(int[] a : input){
            addEdge(a[0], a[1]);
        }

        distance = new int[n];

        int shortest = bfs(0, 3);
        // 0 > 1 > 2 > 3 > 4
        System.out.println(shortest);

    }
    static void addEdge(int a, int b) { // 단방향을 양방향으로 풀기
        list.get(a).add(b);
        list.get(b).add(a);
    }

    static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll(); // 현재 위치를 꺼내면서(방문)
//            System.out.print(next + " "); // 방문 순서 출력
            for (int next : list.get(now)) {
                if (visited[next] != true) {
                    queue.add(next); // 이어진 노드(방문예정)를 큐에 삽입
                    distance[next] = distance[now] + 1; // 직전 노드의 거리 + 1
                    visited[next] = true;
                    if (next == end) { // 도착지점이 담기면 종료
                        return distance[next];
                    }
                }
            }

        }
        return -1;
    }

}



// 프로그래머스 : 게임 맵 최단거리
