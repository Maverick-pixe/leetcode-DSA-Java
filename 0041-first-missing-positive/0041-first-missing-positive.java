class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        for(int i =1;i<=n;i++){
            if(!seen.contains(i)){
                return i;
            }
        }
        return n+1;
    }
}