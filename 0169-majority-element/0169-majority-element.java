class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int num: nums){
       int  count = map.getOrDefault(num,0)+1;
        map.put(num,count);
        if(count > threshold){
            return num;
        }
       }
       return -1;
    }
}