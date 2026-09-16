class Solution {
    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1;
        int left = 0;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right--];
            }
            else 
                left++;
        }

        return right + 1;
    }
}
