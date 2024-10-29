class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        diff = [x - y for x, y in zip(gas, cost)] # subtract entire list from entire list 
        total = sum(diff)
        if total >= 0 :  
            gas_tank, start_index = 0, 0
            for i in range(len(diff)):
                gas_tank += gas[i] - cost[i]
                if gas_tank < 0:
                    start_index = i+1
                    gas_tank = 0
            
            return start_index
        else :
            return -1