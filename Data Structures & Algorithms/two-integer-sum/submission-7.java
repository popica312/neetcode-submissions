class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 1;
        while (i < nums.length)
        {
            while (j < nums.length && target - nums[i] != nums[j])
                j++;
            if (j == nums.length)
            {
                i++;
                j = i + 1;
            }
            else break;
        }
        return new int[]{i, j};
    }
}
