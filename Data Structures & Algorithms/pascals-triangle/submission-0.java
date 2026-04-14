class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTri = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int val = 1;
            for (int k = 1; k <= i; k++) {
                val = val * (i - k + 1) / k;
                row.add(val);
            }
            pascalTri.add(row);

        }
        return pascalTri;
    }
}