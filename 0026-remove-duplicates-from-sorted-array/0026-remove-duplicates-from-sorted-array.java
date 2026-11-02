class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            k++;
        }
        List<Integer> unique = new ArrayList<>(set);
        Collections.sort(unique);

        for(int i =0;i<unique.size();i++){
            nums[i] = unique.get(i);

        }
        return unique.size();
    }
}