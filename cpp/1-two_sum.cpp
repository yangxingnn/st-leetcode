class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> tempMap;
        vector<int> result;
        for(int i=0;i<nums.size();i++){
            if(tempMap.find(target-nums[i])!=tempMap.end())
            {
                result.push_back(tempMap[target-nums[i]]);
                result.push_back(i);
            }
            tempMap[nums[i]] = i;
        }
        return result;
    }
};