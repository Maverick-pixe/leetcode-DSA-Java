class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {              // start from 0
            if (!seen.contains(nums[i])) {         // check value, not index
                seen.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}