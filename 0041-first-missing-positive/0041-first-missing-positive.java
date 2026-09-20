class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int num = 1;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(nums[i] <=0 || i >0 && nums[i] == nums[i-1]){
              continue;
            }
            if(nums[i] ==  num){
               num++;
            }     
            else{
                break;
            } 
        }
        return num;
    }
}