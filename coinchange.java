import java.util.Arrays;

public class coinchange {
    public static void main(String[] args) {
        System.out.println("Hellow world");
        int[] m = aryan();
        for(int k : m){
            System.out.println(k);
        }
    }





    public static int[] aryan(){
        int[] coins = {1,2,5};
        int amount = 12;


        // create a  dp array
        int[] dp = new int[amount+1];

        //fill the arry
        Arrays.fill(dp,amount+1);

//        frist index will be zweo
        dp[0] =0;
//        for all coins
        for(int coin : coins){
            for(int i = coin; i<=amount;i++){
                dp[i] = Math.min(dp[i],dp[i-coin+1]);
            }
        }
        if(dp[amount] <= amount){
            int c = -1;
            return new int[]{c};
        }
        else {
            return new int[]{dp[amount]};
        }


    }
}
