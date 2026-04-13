class Solution {
    public void reverseString(char[] s) {
        //Brute force;
        // Create temporary array. Loop through S array from the end and add each letter to
        // temp array from the beginning
        // now temp array is reversed. S array still is original ordering
        // Then loop once again from S array and replace each letter of S from temp array.
        char[] result = new char[s.length];

        for (int i = s.length -1 , j = 0; i >= 0 ; i--, j++) {
            result[j] = s[i];
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = result[i];
        }
    }
}