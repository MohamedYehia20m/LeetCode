class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> orderMap = new HashMap<>();

        for(int i = 0; i <order.length() ; i++){
            orderMap.put(order.charAt(i),i);
        }

        for(int j = 0 ;j < words.length - 1 ;j++) { // comparing 2 words
            for(int k = 0; k < words[j].length() ; k++) { // comparing 2 letters
                if (k >= words[j+1].length())
                    return false;
                char letter1 = words[j].charAt(k);
                char letter2 = words[j+1].charAt(k);
                int order1 = orderMap.get(letter1);
                int order2 = orderMap.get(letter2);
                /*
                System.out.println("letter1 : " + letter1);
                System.out.println("letter2 : " + letter2);
                System.out.println("order1 : " + order1);
                System.out.println("order2 : " + order2);
                */
                if (order1 > order2) 
                    return false;
                else if (order1 == order2) 
                    continue;
                else
                    break;
            }
        }

        return true;
    }
}