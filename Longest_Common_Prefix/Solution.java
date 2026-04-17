class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int m = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < m) {
                m = strs[i].length();
            }
        }

        for(int i=0; i<m ;i++){
            char a=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=a){
                    return result;
                }
            }

            result+=a;
        }

        return result;
    }
}