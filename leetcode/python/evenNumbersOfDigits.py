class Solution(object):
    @staticmethod
    def numberOfDigits(n):
        count = 0
        while n != 0:
            n = n / 10
            count +=1
        return count
    
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) >= 1 and len(nums) <= 500:
            count = 0
            for i in nums:
                n = self.numberOfDigits(i)
                if n % 2 == 0:
                    count += 1
        return count