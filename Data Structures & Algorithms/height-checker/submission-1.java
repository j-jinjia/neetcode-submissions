class Solution {
    public int heightChecker(int[] heights) {
        int p1 = 0;
        int p2 = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]){
                counter++;
            }
        }
        return counter;
    }
}