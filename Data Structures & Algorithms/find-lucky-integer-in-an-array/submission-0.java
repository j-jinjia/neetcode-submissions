class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int luckyNumber = 0;

        for(int num:map.keySet()){
            if(num == map.get(num)){
                luckyNumber = Math.max(num, luckyNumber);
            }
        }
        return (luckyNumber != 0) ? luckyNumber : -1 ;
    }
}