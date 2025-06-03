class Solution(object):
    def mdc (self, a, b):
        while b != 0:
            resto = a % b
            a = b
            b = resto
        return a
    
    def gcdOfStrings(self, str1, str2):
        if str1 + str2 != str2 + str1:
            return ""
        
        mdc_len_str = self.mdc(len(str1), len(str2))
        
        return str1[:mdc_len_str]
    

        
