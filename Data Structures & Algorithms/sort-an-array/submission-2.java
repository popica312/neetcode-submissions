// Merge sort

class Solution {

    private int[] merge(int[] nums, int l, int m, int r) {
        int k = 0, kl = l, kr = m + 1;
        int[] sorted = new int[r - l + 1];
        while (kl <= m && kr <= r) {
            if (nums[kl] < nums[kr])
                sorted[k++] = nums[kl++];
            else
                sorted[k++] = nums[kr++];
        }
        while (kl <= m)
            sorted[k++] = nums[kl++];
        while (kr <= r) 
            sorted[k++] = nums[kr++];
        
        return sorted;
    }

    private int[] mergeSort(int[] nums, int l, int r) {
        if (l >= r)
            return nums;
        
        int mid = (l + r) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        int[] merged = merge(nums, l, mid, r);

        // rewrite the merge part
        for (int k = 0; k < merged.length; k++) {
            nums[l + k] = merged[k];
        }

        return nums;
    }

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
        // return sorted;
    }
}