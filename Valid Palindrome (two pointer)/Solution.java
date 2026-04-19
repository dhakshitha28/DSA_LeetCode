class Solution {
    public boolean isPalindrome(String s) {
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);

            if (b >= 'A' && b <= 'Z') {
                a += Character.toLowerCase(b);
            } else if (b >= 'a' && b <= 'z'||(b >= '0' && b <= '9')) {
                a += b;
            }
        }


        if (a.length() == 0) {
            return true;
        }

        int i = 0;
        int j = a.length() - 1;

        while (i<j) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}