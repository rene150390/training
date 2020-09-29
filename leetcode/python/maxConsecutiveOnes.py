class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numberOnes = 0
        consecutives = []
        maxCon = 0
        for id, x in enumerate(nums):
            if x == 1:
               numberOnes += 1
               if id == len(nums) - 1:
                    consecutives.append(numberOnes)
            elif x == 0:
                consecutives.append(numberOnes)
                numberOnes = 0
        for y in consecutives:
            if y > maxCon:
                maxCon = y
        return maxCon