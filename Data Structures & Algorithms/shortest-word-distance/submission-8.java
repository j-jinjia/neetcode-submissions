class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int min = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                System.out.println("p1 is " + p1);
                p1 = i;
            } else if (wordsDict[i].equals(word2)) {
                System.out.println("p2 is " + p2);
                p2 = i;
            }
            if(p1 != -1  && p2 != -1) {
                min = Math.min(min, Math.abs(p1 - p2));
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        return min;
    }
}
