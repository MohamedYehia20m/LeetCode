class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        
        // If the number of cards is not divisible by group size, return false
        if (len % groupSize != 0)
            return false;

        // Count the frequency of each card in the hand
        HashMap<Integer, Integer> cardCount = new HashMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        // Sort the hand to handle the smallest card first
        Arrays.sort(hand);

        // Try to form groups of consecutive cards
        for (int card : hand) {
            // If this card is already used in a previous group, skip it
            if (cardCount.get(card) == 0) continue;

            // Try to form a group starting from the current card
            for (int i = 0; i < groupSize; i++) {
                int currentCard = card + i;

                // If the current card doesn't exist in the map or is used up, return false
                if (cardCount.getOrDefault(currentCard, 0) == 0) {
                    return false;
                }

                // Decrease the count of the current card as it's now part of a group
                cardCount.put(currentCard, cardCount.get(currentCard) - 1);
            }
        }

        return true;
    }
}