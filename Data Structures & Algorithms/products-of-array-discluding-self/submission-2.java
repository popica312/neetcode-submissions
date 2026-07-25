class Solution {
    // Solution 3 - OPTIMAL procuts in O(n) time without division:
    // Just do the prefix product in the res array and make it more efficient on time,
    // will also require one less pass
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // fill res with left pass product
        int prefix = 1, postfix = 1;
        for (int i = 0; i < n; i++)
        {
            res[i] = prefix;
            prefix *= nums[i];
        }
        // now keep track of postfix and multiply from right to left
        for (int i = n - 1; i >= 0; i --)
        {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
