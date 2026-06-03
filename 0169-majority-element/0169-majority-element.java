class Solution {
    public int majorityElement(int[] nums) {
        int n  = nums.length;
        int threshHold = n/2;
        Map<Integer,Integer> seen = new HashMap<>();
        for(int num: nums){
            int count = seen.getOrDefault(num,0)+1;
            seen.put(num,count);
            if(count > threshHold) return num;
        }
    return -1;
    }
}