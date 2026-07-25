class Solution {
    // Solution 2 - procuts in O(n) time without division:
    // PrefixSum (but do product instead) starting from left to right and from right to left. 
    // multiplication of right and left should be the final answer for each number
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftprod = new int[n], rightprod = new int[n], res = new int[n];
        leftprod[0] = nums[0];
        rightprod[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i ++)
            leftprod[i] = leftprod[i - 1] * nums[i];
        for (int i = n - 2; i >= 0; i--)
            rightprod[i] = rightprod[i + 1] * nums[i];
        
        res[0] = rightprod[1];
        res[n - 1] = leftprod[n - 2];
        for (int i = 1; i < n - 1; i ++)
            res[i] = leftprod[i - 1] * rightprod[i + 1];
        
        return res;
    }
}  
