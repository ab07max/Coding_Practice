class Solution(object):
    def twoSum(self, nums, target):
        result = []
        for i in range(0, len(nums)):
            for j in range(i + 1, len(nums)):
                if(nums[i] + nums[j] == target):
                    result = [i, j]
                    return result
                else:
                    pass
nums = [2, 7, 11, 15]
target = 9
indexValues = Solution()
solution = indexValues.twoSum(nums, target)
print solution