class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        for m,n in enumerate(nums): #convert entire list to string with enumerate()
            nums[m] = str(n)
        
        def comparison(a , b) :
            if a + b > b + a :
                return -1
            else:
                return 1

        nums = sorted(nums , key = cmp_to_key( comparison ))
        return str(int( ''.join( nums ) ))

