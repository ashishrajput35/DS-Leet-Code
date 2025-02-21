public class StockBuySell {



    public int maxprofit(int[] prices){

        int start = 0;
        int end = prices.length-1;

        int minPrice =0;
        int maxPrice = 0;
        int maxProfit = 0;
        while(start < end){

            minPrice = prices[start];
            maxPrice = prices[end-1];

           int  currentProfit = maxPrice- minPrice;

            if(maxProfit < currentProfit){

                maxProfit = currentProfit;

            }else{

                end--;
            }


        }

        return maxProfit;
    }
    public static void main(String[] args){

        System.out.println("hello world");
    }
}
