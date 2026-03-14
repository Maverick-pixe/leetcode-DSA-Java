class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        int left = 0,right = 0; long sum = 0,maxSum = 0;

        while(right<n){
            while(seen.contains(nums[right])){
                seen.remove(nums[left]);
                sum-= nums[left];
                left++;
            }
            seen.add(nums[right]);
            sum+=nums[right];
            right++;

            if(right-left ==k){
                maxSum = Math.max(maxSum,sum);
                seen.remove(nums[left]);
                sum-= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}