class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle 0 and 1 separately for simplicity

        int l = 1, r = x;
        int res = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;
            
            // Cast to long to prevent overflow
            if ((long)m * m > x) {
                r = m - 1;
            } else if ((long)m * m < x) {
                l = m + 1;
                res = m; // Keep track of the floor value
            } else {
                return m;
            }
        }
        return res;
    }
}