import itertools

class Solution(object):

    def sumOfTriplets(self, lst):
        sum = 0
        for i in range(len(lst)):
            sum += lst[i]
        return sum


    def threeSum(self, nums, targetSum):
        result = []
        final_result = []
        threeCombinationList = list(itertools.combinations(nums, 3))
        for i in range(len(threeCombinationList)):
            sum = self.sumOfTriplets(threeCombinationList[i])
            if(sum == targetSum):
                result.append(threeCombinationList[i])
            else:
                pass
        #Converting into lists as combinations give tuples
        for i in range(len(result)):
            final_result.append(list(result[i]))        
        return final_result

nums = [-1, 0, 1, 2, -1, -4]

threeSumObject = Solution()
result = threeSumObject.threeSum(nums, 0)
print result