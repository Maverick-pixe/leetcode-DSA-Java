class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertPos = 0;
        int[] result = new int[n];

        for( int num : nums){
            if(num != 0){
                result[insertPos] = num;
                insertPos++;
            }

        }
        for( int i = 0;i<n;i++){
            nums[i] =result[i];
        }
    }
}