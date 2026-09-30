// Any sorting algorithm works. Better solution is to take advantage of the small amount of values (counting problem).
// Unless we care about the order, this is the fastest way
class Solution {
    public void sortColors(int[] nums) {
        int[] colours = {0, 0, 0};
        int n = nums.length, k = 0;
        for (int num : nums)
            colours[num]++;
        for (int i = 0; i < 3; i++)
            while (colours[i] > 0)
            {
                nums[k++] = i;
                colours[i]--;
            }
    }
}