class Solution {
   
    public List<List<String>> groupAnagrams(String[] strs) {
         // A map to store sorted strings as keys and lists of anagrams as values
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Convert the string to a character array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // Create a string from the sorted character array
            String sorted = new String(chars);
            
            // Group anagrams by the sorted string
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }
        
        // Convert the values of the map to a list of lists
        return new ArrayList<>(map.values());
    }
}