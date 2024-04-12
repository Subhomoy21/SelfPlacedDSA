package Arrays;

public class StockBuyAndSell {
    // naive solution
    static int maxProfit(int [] price , int start , int end){
        if(end<=start){
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end ; i++) {
            for (int j = i+1; j <= end ; j++) {
                if(price[j]>price[i]){
                    int curr_Profit =  price[j] - price[i] + maxProfit(price,start,i-1) + maxProfit(price,j+1,end);
                    profit = Math.max(profit,curr_Profit);
                }
            }
        }
        return profit;
    }
    // efficient solution
    static int maxProfits(int[] prices) {
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices,0,prices.length-1));
        System.out.println(maxProfits(prices));
    }
}
