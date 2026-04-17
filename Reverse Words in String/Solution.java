class Solution {
    public String reverseWords(String s) {
        String result="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(!ans.equals("")){
                    result = ans + " " + result;
                    ans="";
                }
            }
            else{
                ans=ans + String.valueOf(s.charAt(i));
            }
        }

        if(!ans.equals("")){
            result = ans + " " + result;
        }

        return result.trim();
    }
}