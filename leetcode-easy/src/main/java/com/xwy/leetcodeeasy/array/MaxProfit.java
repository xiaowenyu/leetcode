package com.xwy.leetcodeeasy.array;

/**
 * 时间复杂度 O(n)
 * 112 贪心算法II
 * Created by xiaowenyu on 2018/9/12.
 */
public class MaxProfit {

    public static void main(String[] args) {

        int[] nums = new int[]{7,1,5,3,6,4,20};
        System.out.println(new MaxProfit().maxProfit3(nums));
    }

    /**
     * 时间复杂度：O(n^2)
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {

        //遍历该数组，获取后面的股票-前面的股票中的最大值
        int result = 0;
        for (int i = 0; i < prices.length ; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                result = (prices[j] - prices[i]) > result ? prices[j] - prices[i] : result;
            }
        }
        return result;

    }

    public int maxProfit2(int[] prices) {

        int result = 0;
        //判断前一天和后一天的股票是否升值，
        // 升值则买入
        for (int i = 0; i < prices.length - 1; i++) {

            if(prices[i] < prices[i+1]){
                result += prices[i+1] - prices[i];
            }

        }

        return result;
    }


    public int maxProfit3(int[] prices) {

        if(prices==null || prices.length==0) {
            return 0;
        }
        int[] local = new int[3];
        int[] global = new int[3];
        for(int i=0;i<prices.length-1;i++)
        {
            int diff = prices[i+1]-prices[i];
            System.out.println(i+1);
            System.out.println("-----diff:"+diff);
            for(int j=2;j>=1;j--)
            {
/*                local[j] = Math.max(global[j-1]+(diff>0?diff:0), local[j]+diff);
                global[j] = Math.max(local[j],global[j]);*/

                //今天买，今天卖
                if(diff == 0){

                }
                //昨天买，今天卖
                else if(){

                }
                //前些天买，今天卖

                System.out.println("-----local["+j+"]:"+local[j] +"----global["+j+"]:"+global[j]);
            }
        }
        return global[2];
    }
}
