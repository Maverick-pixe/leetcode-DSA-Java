class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            boolean isSingle = false;
            for(int j = 0;j<n;j++){
                if(i!=j && nums[i] == nums[j]){
                    isSingle = true;
                    break;
                }
            }
                if(!isSingle){
                    return nums[i];
                }
        }
        return -1;
    }
}