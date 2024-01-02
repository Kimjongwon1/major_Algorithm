import java.util.Arrays;

public class GreedyCoinProblem {
    public static void main(String[] args) {
        int[] coins = {1,5,10,15,25};
        int amount = 99;
        int a = 0 ;
//        최소 동전의 갯수 산출
      for(int i= coins.length-1;i>=0;i--){

              int temp = amount/coins[i];
              a += temp;
              amount -= temp *coins[i];

      }
        System.out.println(a);

    }
}
