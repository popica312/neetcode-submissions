class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] frequency = new int[26];
        for (char ch: s.toCharArray())
            frequency[Character.toLowerCase(ch) - 'a']++;
        for (char ch: t.toCharArray())
            frequency[Character.toLowerCase(ch) - 'a']--;
        for (int i = 0; i < 26; i++)
            if (frequency[i] != 0)
                return false;
        return true;
    }
}
