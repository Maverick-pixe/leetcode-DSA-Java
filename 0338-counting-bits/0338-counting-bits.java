class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Bit count of i = bit count of (i without last bit) + last bit
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}