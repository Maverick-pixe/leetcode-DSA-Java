class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length ==0) return 0;
       
        int n = nums.length;
        int insertPos = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] != nums[insertPos-1]){
              nums[insertPos] = nums[i];
              insertPos++;
            }
        }
        return insertPos;
    }
}