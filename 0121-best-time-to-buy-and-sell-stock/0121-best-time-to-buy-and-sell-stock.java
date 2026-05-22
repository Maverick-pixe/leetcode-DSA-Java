class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
         
        for(int price : prices){
            if(price <minPrice){        // O(n). We make a single pass through the array, 
                minPrice = price;            //  doing O(1) work at each step.
            }
            else{                              //O(1). We only use two variables
                maxProfit = Math.max(maxProfit,price - minPrice);
            }
        }
        return maxProfit;
    }
}