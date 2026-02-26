class Solution:
    def numSteps(self, s: str) -> int:
        c=0
        a=int(s,2)
        while a!=1:
            if a%2==0:
                a=a//2
            else:
                a+=1
            c+=1
        return c