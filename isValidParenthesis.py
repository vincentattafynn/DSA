from collections import deque

class Solution:
    def isValid(self, s: str) -> bool:
        stack = deque()
        switcher = {
            "}":"{",
            ")":"(",
            "]":"["
        }
        for ch in s:
            if ch in '[{(':
                stack.append(ch)
            elif ch in '}])':
                if len(stack) == 0:
                    return False
                elif stack.pop() != switcher.get(ch):
                    return False
        return not stack