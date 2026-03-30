class Solution {
    public int countSeniors(String[] details) {
        int oldPeople = 0;

        for(String info:details) {

            int age = Integer.valueOf(info.substring(11,13));

            if(age > 60) {
                oldPeople ++;
            }
        }
        return oldPeople;
    }
}