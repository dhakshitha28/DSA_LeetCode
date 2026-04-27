class Solution {
    public boolean isPalindrome(int x) {

        int value=x;

        if(x<0){
            return false;
        }

        int result=0;

        while(x > 0){
            int lastValue= x % 10;
            result = result *10 + lastValue;
            x=x/10;
        }

        if(value==result){
            return true;
        }

        return false;

    }
}