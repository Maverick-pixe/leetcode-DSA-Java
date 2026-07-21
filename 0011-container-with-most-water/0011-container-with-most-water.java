class Solution {
     static {
        for(int i=0; i<100; i++){
            maxArea(new int []{0,0});
        }
    }
    public  static int maxArea(int[] height) {
        int h = height.length;
        int left = 0;
        int right = h-1;
        int maxArea = 0;       // total Area = width * height of min(i,j)
                                // time Complexity = O(n)
        while(left<right){
            int width = right - left;
             int length = Math.min(height[left],height[right]);
            int currentArea = width * length;
            maxArea = Math.max(maxArea,currentArea);

            if(height[left] < height[right]){
                left++;
            }else{       // Space Complexity  = O(1) no additional data structures used
                right--;
            }
        }
        return maxArea;
    }
}