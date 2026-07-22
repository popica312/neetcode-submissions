class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        vector<int> hasDuplicates;
        for (int num: nums)
        {
            if (std::find(hasDuplicates.begin(), hasDuplicates.end(), num) != hasDuplicates.end())
                return true;
            hasDuplicates.push_back(num);
        }
        return false;
    }
};
