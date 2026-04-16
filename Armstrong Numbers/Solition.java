// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int duplicate=n;
        int sum=0;

        //Extaction Of Digits
        while(n>0){

            int lastDigits=n%10;
            sum=sum+(lastDigits*lastDigits*lastDigits);
            n=n/10;

        }

        boolean result =false;
        if(duplicate ==sum){
            result=true;
        }

        return result;
    }
}