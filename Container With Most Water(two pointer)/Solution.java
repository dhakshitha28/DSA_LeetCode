class Solution {
    public int maxArea(int[] height) {
        int result=0;
        int i=0;
        int j =height.length-1;

        while(i<j){
            int l=Math.min(height[i],height[j]);
            int b=j-i;
            int ans=l*b;
            if(result<ans){
                result=ans;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return result;
    }
}