class Solution {
    public int scoreOfString(String s) {
        char[] charArr = s.toCharArray();
        int totalSum = 0;


        for(int i = 1; i < charArr.length; i++){
            totalSum += Math.abs(charArr[i] - charArr[i - 1]);
        }

        return totalSum;
    }
}