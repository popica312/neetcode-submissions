class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int write = 0;
        for (int i = 0; i<n; i++){
            if (nums[i] != val){
                if (nums[write] == val){
                    nums[write] = nums[i];
                    nums[i] = val;
                }
                write++;
            }
        }
        return write;
    }
}