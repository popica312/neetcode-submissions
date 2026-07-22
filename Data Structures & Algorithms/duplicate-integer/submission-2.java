class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> found = new ArrayList<>();
        for (int num: nums)
        {
            if (found.contains(num))
                return true;
            found.add(num);
        }
        return false;
    }
}
