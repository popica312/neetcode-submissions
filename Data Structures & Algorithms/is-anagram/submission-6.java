class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            dict.merge(s.charAt(i), 1, Integer::sum);
            dict.merge(t.charAt(i), -1, Integer::sum);
        }
        for (char key: dict.keySet())
        {
            if (dict.get(key) != 0)
                return false;
        }
        return true;
    }
}
