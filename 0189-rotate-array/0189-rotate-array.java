class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =k%n;
      
       reverseIt(nums,0,n-1);
       reverseIt(nums,0,k-1);
       reverseIt(nums,k,n-1);
        }
        private void reverseIt( int nums[],int left ,int right){
            while(left < right){
                int temp = nums[left];    // O(n). Each reversal visits at most n elements. 
                                         // We do 3 reversals, so it's 3 * O(n) = O(n).
                nums[left]= nums[right];
                nums[right] = temp;
                left++;                  // O(1). We only use a single temporary variable for swapping.
                right--;
            }
        }
    }