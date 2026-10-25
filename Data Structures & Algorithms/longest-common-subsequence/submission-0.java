/*
 This is the efficient way of doing this, in space time
*/

class Solution {
    int[] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() < text2.length()){
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        int n = text1.length(), m = text2.length();
        dp = new int[m + 1];

        for (int i = n - 1; i >= 0; i--) {
            int prev = 0;
            for (int j = m - 1; j >= 0; j--) {
                int temp = dp[j];
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[j] = 1 + prev;
                } else {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                prev = temp;
            }
        }

        return dp[0];
    }
}
