class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length -1; i++){
            int maxToRight = -1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > maxToRight){
                   maxToRight = arr[j];
                }
            }
            arr[i] = maxToRight;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }
}