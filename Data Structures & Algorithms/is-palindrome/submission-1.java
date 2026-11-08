class Solution {

    private boolean isAlphaNum(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
            (ch >= 'A' && ch <= 'Z') ||
            (ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!isAlphaNum(s.charAt(left))) {
                left++;
            }
            else if (!isAlphaNum(s.charAt(right))) {
                right--;
            }
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
