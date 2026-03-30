class Solution {
    public boolean confusingNumber(int n) {
        int confNum = 0;

        String num = String.valueOf(n);
        char[] charArr = num.toCharArray();
        char[] charrConf = new char[num.length()];

        int index = num.length() - 1 ;
        for(char c : charArr){
            if(c == '2' || c == '3' || c == '4' || c == '5' || c == '7'){
                return false;
            }
            
            if(c == '0') charrConf[index] = '0';
            else if(c == '1') charrConf[index] = '1';
            else if(c == '6') charrConf[index] = '9';
            else if(c == '8') charrConf[index] = '8';
            else if(c == '9') charrConf[index] = '6';
            
            index--;
        }
        String num2 = String.valueOf(charrConf);

        return !num.equals(num2);
    }
}
