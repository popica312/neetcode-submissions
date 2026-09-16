class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current = nums[0];
        int index = 0;
        int n = nums.length;
        while (index < n) {
            if (count < 0) {
                count = 0;
                current = nums[index];
            }
            else if (current == nums[index++])
                count++;
            else count--;
        }
        return current;
    }
}