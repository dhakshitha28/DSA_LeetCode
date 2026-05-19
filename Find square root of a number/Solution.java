class Solution {
    int floorSqrt(int n) {
        // code here

        int result=0;

        for(int i=1; i*i<=n ;i++){
            if(i*i<=n){
                result=i;
            }
        }

        return result;
    }
}