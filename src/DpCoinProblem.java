import java.util.Arrays;

//public class DpCoinProblem {
//    public static void main(String[] args) {
//        int[] coins = {1,4,5};
////        13원이 되게.
////        12원이 되게하는동전,9원 동전,8월 동전, case중 가장 작은 동전수 +1
//        int answer = 0;
//        int min[] = new int[14];
//        int min1[] = new int[4];
//        for(int i =1; i<=13; i++){
//            for(int j=0; j< coins.length-1;j++){
//              min[i-1] += i/coins[j];
//            }
//        }
//        for(int i=1; i<4; i++){
//            min1[i-1] = min[min.length-i];
//        }
//       Arrays.sort(min1);
//        answer = min1[0]+1;
//        System.out.println(answer);
//    }
//}
public class DpCoinProblem {
    public static void main(String[] args) {
        int[] coins = {1, 4, 5};
        int amount = 13;
        int[] min = new int[amount + 1];
        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && min[i - coin] != Integer.MAX_VALUE) {
                    min[i] = Math.min(min[i], min[i - coin] + 1);
                }
            }
        }

        int answer = min[amount];
        System.out.println(answer);
    }
}
