class Solution {
    public int maxProfit(int[] prices) {
        int currSum = 0;
        int maxSum = 0;

        for(int i = 1;i< prices.length;i++){
            int diff = prices[i]- prices[i-1];
            if(currSum + diff > 0){
                currSum += diff;
            }
            else{
                currSum = 0;
            }
            if( currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}