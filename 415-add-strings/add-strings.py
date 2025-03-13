class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
       sys.set_int_max_str_digits(10000)
       n=int(num1)
       m=int(num2)
       c=n+m
       s=str(c)
       return s