import java.util.Arrays;

class coin{
    public static void main(String[] args){
        int coins[]={1,2,5},amount=11;
        int m = amount+1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,m);
        dp[0]=0;
        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
               if(coins[j]<=i){
                dp[i]=Math.min(dp[i] ,1+dp[i-coins[j]]);
               }
            }
        }
        int p = dp[amount]>amount? -1 : dp[amount]; 
        System.out.println(p);
    }
}