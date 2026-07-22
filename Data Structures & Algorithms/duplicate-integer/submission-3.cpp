class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::map<int, int> frequency;
        for (int num : nums)
        {
            if (frequency[num] == 0)
                frequency[num] = 1;
            else return true;
        }
        return false;
    }
};