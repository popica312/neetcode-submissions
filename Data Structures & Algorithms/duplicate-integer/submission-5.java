class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> ans = new HashMap<>();
        for (int num: nums)
            if (ans.containsKey(num))
                return true;
            else ans.put(num,true);
        
        return false;
    }
}