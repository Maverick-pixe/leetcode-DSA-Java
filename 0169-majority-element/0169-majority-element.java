class Solution {
    public int majorityElement(int[] nums) {
        int  n = nums.length;
        int threshHold = n/2;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            count = map.getOrDefault(num,0)+1;
            map.put(num,count);
            if(count > threshHold){
                return num;
            }
        }
        return -1;
    }
}