class Solution {
    public int maxProductDifference(int[] nums) {
        int x = 0;
        int y = 0;
        int z = Integer.MAX_VALUE; 
        int w = Integer.MAX_VALUE;
//initialize at max value otherwise the if statement fails. 
// consider nums = [5,6,2,7,4]:
//         z stays 0 (should be 2)
//         w stays 0 (should be 4)

        for(int num : nums){
            if(num > x){
                y = x;
                x = num;
            }else if( num > y){
                y = num;
            }

            if(num < z){
                w = z;
                z = num;
            }else if( num < w){
                w = num;
            }
        }
        return (x*y) - (z*w);
    }
}