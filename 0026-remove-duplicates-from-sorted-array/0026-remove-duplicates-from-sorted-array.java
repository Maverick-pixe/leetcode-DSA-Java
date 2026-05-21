class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
          if (n == 0) return 0;
        int InsertPos = 1;
       for(int i = 1;i<n;i++){
        if(nums[i] != nums[InsertPos-1]){    // O(n) becuse we iterate only once
            nums[InsertPos] = nums[i];   // O(1) no additional data structures like arrays
            InsertPos++;                   //or hashMap to store uniques
        }
       }
       return  InsertPos;
    }
}