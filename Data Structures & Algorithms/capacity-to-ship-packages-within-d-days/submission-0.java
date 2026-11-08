class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = -1;
        int right = 0;
        for (int i = 0; i < weights.length; i++) {
            right += weights[i];
            if (left < weights[i]) {
                left = weights[i];
            }
        }
        int capacity = right;
        while (left < right) {
            int mid = (left + right) / 2;
            int sum = 0;
            int d = days;
            for (int i = 0; i < weights.length; i ++) {
                if (sum + weights[i] <= mid) {
                    sum += weights[i];
                } else {
                    sum = weights[i];
                    d--;
                }
            }
            if (d <= 0) {
                left = mid + 1;
            } else {
                capacity = Math.min(capacity, mid);
                right = mid;
            }
        }
        return capacity;
    }
}