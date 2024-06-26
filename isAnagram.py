class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = list(s)
        t = list(t)

        if len(s) != len(t):
            return False
        
        s.sort()
        t.sort()
        
        for i in range(len(s)):
            if s[i] != t[i]:
                return False
            
        return True