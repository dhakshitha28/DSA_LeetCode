class Solution {
    public boolean isPalindrome(int n) {

        String value = String.valueOf(n);
        char ch[] = value.toCharArray();
        String resultString = "";

        for(int i = ch.length - 1; i >= 0; i--){
            resultString += ch[i];
        }

        return value.equals(resultString);
    }
}