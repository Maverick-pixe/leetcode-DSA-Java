class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long count = 0;
        long conZero = 0;
        for (int num : nums) {
            if (num == 0) {        //: O(n). We make a single pass through the array,
                conZero++;         // doing O(1) work per element.
            } else
                conZero = 0;
            count += conZero;      //O(1). We only use two variables
                                   // (count and        consecutiveZeros)
        }
        return count;
    }
}