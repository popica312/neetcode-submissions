// Heap Sort

class Solution {
    public int[] sortArray(int[] nums) {
        return heapSort(nums);
    }

    private void heapify(int[] nums, int n, int i) {
        int l = (i << 1) + 1;
        int r = (i << 1) + 2;
        int largestNode = i;
        
        if (l < n && nums[l] > nums[largestNode]) {
            largestNode = l;
        }

        if (r < n && nums[r] > nums[largestNode]) {
            largestNode = r;
        }

        if (largestNode != i) {
            int temp = nums[i];
            nums[i] = nums[largestNode];
            nums[largestNode] = temp;
            heapify(nums, n, largestNode);
        }
    }

    private int[] heapSort(int[] nums) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i, 0);
        }

        return nums;
    }
}