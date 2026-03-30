class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for(Integer i : arr){
            frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(frequencies.containsKey(arr[i]) && frequencies.containsKey(arr[i] + 1)){
                count += 1;
            }
        }
        return count;
    }
}
