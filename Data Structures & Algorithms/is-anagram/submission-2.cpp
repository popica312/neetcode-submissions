class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size())
            return false;

        unordered_map<char, int> s_chars, t_chars;
        for (int i = 0; i < s.size(); i ++)
        {
            s_chars[s[i]]++;
            t_chars[t[i]]++;
        }

        return s_chars == t_chars;
    }
};
