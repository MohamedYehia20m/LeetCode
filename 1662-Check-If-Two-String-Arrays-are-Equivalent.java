class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len1 = word1.length;
        int len2 = word2.length;

        String res1 = "";
        String res2 = "";

        for (String ele : word1 ){
            res1 += ele;
        }

        for (String ele2 : word2){
            res2 += ele2;
        }

        //System.out.println("res1: " + res1);
        //System.out.println("res2: " + res2);
        
        return res1.equals(res2);
    }
}