class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        max_candies = max(candies)

        output = []

        for candie in candies:
            output.append(candie + extraCandies >= max_candies)
            
        return output
