class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;

        for(int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                min_length = Math.min(min_length, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        if (min_length == Integer.MAX_VALUE)
            return 0;
        return min_length;
    }
}