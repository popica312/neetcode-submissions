class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums)
            if (val != num)
                k++;
        
        int addition = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                for (int j = k + addition; j < nums.length; j++) {
                    if (nums[j] != val) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        addition++;
                        break;
                    }
                }
            }
        }

        return k;
    }
}