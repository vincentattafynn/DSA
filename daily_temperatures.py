from collections import deque

def dailyTemperatures(temperatures):
    ans = [0] * len(temperatures)
    stack = deque()

#Loops backwards (Remember start, end, step)
    for i in range(len(temperatures) -1, -1, -1):
        curr = temperatures[i]
        
        #while the loop isnt empty and the current temperature is greater than the topmost element in the stacks actual temp
        while stack and curr >= temperatures[stack[-1]]:
            #pop the topmost element, cause its smaller.
            stack.pop()


        if stack:
            #if theres an element in the stack and the while loop has been passed, it means
            #the top most value in the stacks corresponding temperature is larger to find the difference
            #then thats the answer for the the current index.
            ans[i] = stack[-1] - i
            
        #append the index cause it might be the next largest day for another element in the temp
        #list.
        stack.append(i)
        
    
    return ans

        

temperatures = [30,60,90]
print(dailyTemperatures(temperatures))
