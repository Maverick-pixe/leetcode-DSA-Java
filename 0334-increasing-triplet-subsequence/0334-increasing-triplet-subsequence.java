class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                // Smallest value so far      Greedy approch 
                first = num;
            } else if (num <= second) {
                // Second smallest value (greater than some earlier first)
                second = num;
            } else {
                // Found a value greater than both first and second
                return true;
            }
        }

        return false;
    }
}