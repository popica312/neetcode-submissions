class Solution {
    // Solution 1 - intuitive: multiply all numbers, then divide for num[i] for each i
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        boolean one_zero = false, two_zero = false;
        for (int num: nums)
            if (num != 0)
                product *= num;
            else 
            {
                if (one_zero)
                {
                    two_zero = true;
                    break;
                }
                else 
                    one_zero = true;
            }
        
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            if (two_zero)
                res[i] = 0;
            else if (one_zero)
                res[i] = (nums[i] == 0 ? (int)product : 0);
            else
                res[i] = (int)(product / (long)nums[i]); 
        }
        return res;
    }
}  
