class Solution {
public:
    bool isAnagram(string s, string t) {
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
    }
};
