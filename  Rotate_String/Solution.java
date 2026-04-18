class Solution {
    public boolean rotateString(String s, String goal) {
        int original=s.length();
        int a=goal.length();
        if(original!=a){
            return false;
        }

        s=s+s;
        boolean result=s.contains(goal);
        return result;
    }
}