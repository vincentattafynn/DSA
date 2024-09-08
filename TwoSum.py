class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        fin_list = []
        for i in range(len(nums)):
            fin_list.append(i)
            target_two = target - nums[i]
            for n in range(i + 1, len(nums)):
                if nums[n] == target_two:
                    fin_list.append(n)
                    print(fin_list)
                    return fin_list
            fin_list.clear()

            