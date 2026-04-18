class Solution {
    public boolean isIsomorphic(String s, String t) {

        boolean result=false;

        if(s.length()!=t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }

        Map<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if (!map.containsKey(s.charAt(i))) {

                if (map.containsValue(t.charAt(i))) {
                    return false;
                }

                map.put(s.charAt(i),t.charAt(i));
                result =true;
            }

            else {
                if(t.charAt(i)!=map.get(s.charAt(i))){
                    return false;
                }
            }
        }

        return result;

    }
}
