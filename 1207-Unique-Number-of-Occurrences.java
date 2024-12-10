class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num : arr) {
            //int currentValue;
            if (freq.containsKey(num))
            {
                int currentValue = freq.get(num);
                freq.put(num , currentValue + 1);
            }     
            else
                freq.put(num,1);
        }

        List<Integer> valuesList = new ArrayList<>(freq.values());
        Set<Integer> valuesSet = new HashSet<>(freq.values());

        return valuesList.size() == valuesSet.size();
    }
}