class Solution {
    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1, left = 0;
        while (right >= 0 && left <= right) {
            if (nums[left] == val) {
                // perform swap operation and increase count
                int temp = nums[left];
                nums[left] = nums[right--];
            }
            else 
                left++;
        }

        return right + 1;
    }
}