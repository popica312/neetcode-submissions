class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length())
            return false;
        
        /*
        /* My implementation: expected behaviour (unecessary second row of passes, can do it all in one pass)

        std::unordered_map<char, int> frequency;
        for (char ch : s)
        {
            frequency[ch]++;
        }
        for (char ch : t)
        {
            if (frequency[ch] > 0)
                frequency[ch]--;
            else return false;
        }
        for (auto [ch, count] : frequency)
            if (count != 0)
                return false;
        return true;
        */

        std::unordered_map<char, int>frequency;
        for (int i = 0; i < s.length(); i++)
        {
            frequency[s[i]]++;
            frequency[t[i]]--;
        }
        // verification that there are no extra letters
        for (auto [ch, total] : frequency)
            if (total != 0)
                return false; // if there is (at least) one character is extra/less
        return true;
    }
};
