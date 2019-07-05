package yp;

/**
 * @author RickYinPeng
 * @ClassName Y_121_买卖股票的最佳时机
 * @Description
 * @date 2019/3/29/23:33
 */
public class Y_121_买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int i = maxProfit(a);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        if(prices.length<=0){
            return 0;
        }
        if(prices.length ==1){
            return 0;
        }
        if(prices.length==2){
            if((prices[1]-prices[0])>0){
                return prices[1]=prices[0];
            }else{
                return 0;
            }
        }
        int min = prices[0];
        int price = prices[1]-prices[0];
        for (int i = 1;i<=prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            price = Math.max(price,prices[i] - min);
        }
        return price;
    }

    public static int maxProfit_2(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                max = Math.max(max,prices[i]-min);
            }
        }

        return max;
    }

}
