class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        temp_dict = {}
        for i in range(len(nums)):
            if nums[i] in temp_dict:
                return [temp_dict[nums[i]],i]
            temp_dict[target-nums[i]] = i