class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < n; i ++) {
            int poz = Math.abs(nums[i]) - 1;
            if (poz >= 0 && poz < n) {
                if (nums[poz] > 0) {
                    nums[poz] *= -1;
                }
                else if (nums[poz] == 0) {
                    nums[poz] = -(n + 1);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] >= 0)
                return i;
        }
        return n + 1;
    }
}