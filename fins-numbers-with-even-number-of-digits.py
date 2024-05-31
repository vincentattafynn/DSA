class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        iseven = 0
        
        for num in nums:
            temp = str(num)
            temp = [*temp]
            if len(temp) % 2 == 0:
                iseven = iseven + 1
        return iseven