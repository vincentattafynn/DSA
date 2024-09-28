class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_dict = defaultdict(int)
        sorted_dict = dict()
        final_list = []
        for i in nums: 
            num_dict[i] += 1
            
        sorted_dict = sorted(num_dict.items(), key=lambda x:x[1], reverse=True)
        
        final_list = [item[0] for item in sorted_dict[:k]]

        return final_list