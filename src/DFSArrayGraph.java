//public class DFSArrayGraph {
//    static boolean[] visted;
//    static int[][] graph_s;
//    public static void main(String[] args) {
//        graph_s = new int[][]{
//                {
//                        0, 1, 1, 0, 0
//                },
//                {
//                        1, 0, 0, 1, 0
//                },
//                {
//                        1, 0, 0, 1, 1
//                },
//                {
//                        0, 1, 1, 0, 0
//                },
//                {
//                        0, 0, 1, 0, 0
//                }
//        };
//        visted = new boolean[graph_s.length];
//        int start = 0;
//        dfs(start);
//        System.out.println();
//   }
//   static void dfs(int start){
//        visted[start] =true;
//        for(int i=0;i<graph_s.length;i++){
//            if(visted[i] == false && graph_s[start][i]==1){
//                dfs(i);
//            }
//
//        }
//
//   }
//}
public class DFSArrayGraph {
    static boolean[] visited;
    static int[][] graph_s;

    public static void main(String[] args) {
        graph_s = new int[][] {
                {0, 1, 1, 0, 0},
                {1, 0, 0, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0}
        };
        visited = new boolean[graph_s.length];
        int start = 0;
        dfs(start);
    }


    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < graph_s.length; i++) {
            if (!visited[i] && graph_s[start][i] == 1) {
                dfs(i);
            }
        }
    }
}
