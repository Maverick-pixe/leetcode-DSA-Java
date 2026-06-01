class Solution {
    public boolean increasingTriplet(int[] nums) {
        int  n = nums.length;
        int first =  Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(nums[i] <= first){
                first = nums[i];     //O(n). Single pass through the array, doing O(1) work per element.
               
            }else if(nums[i] <= second){
                  second = nums[i];
                }
            else{            // O(1). Only two extra variables 
                return true;
            }
            }
        return false;
        }
    }
