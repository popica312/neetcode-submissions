class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (prevMap.containsKey(target - nums[i]))
            {
                return new int[] {prevMap.get(target - nums[i]), i};
            }

            prevMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
