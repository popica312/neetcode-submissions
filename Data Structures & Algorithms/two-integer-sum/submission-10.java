class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // <val, index>
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i]))
                map.put(nums[i], i);
            else {
                int l = i, r = map.get(target - nums[i]);
                if (l > r) {
                    int temp = l;
                    l = r;
                    r = temp;
                }
                return new int[]{l, r};
            }
        }
        return new int[]{0, 0};
    }
}
