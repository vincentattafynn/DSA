import operator

class Solution:
        
    def evalRPN(self, tokens):
        ops = {
            '+': operator.add,
            '-': operator.sub,
            '*': operator.mul,
            '/': lambda op1, op2 : int(op1/op2)
        }
        
        stack = []
        
        for token in tokens:
            if token not in ops:
                stack.append(token)
            
            else:
                op2 = int(stack.pop())
                op1 = int(stack.pop())
                temp = ops[token](op1,op2)
                stack.append(temp)

                
        
        return int(stack[0])
