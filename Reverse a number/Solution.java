// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int result = 0;

        while(n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;
        }

        return result;
    }
}