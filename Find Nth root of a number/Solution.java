class Solution {
    public int nthRoot(int n, int m) {
        // code here

        int result=-1;


        if(m == 0){
            return 0;
        }
        int low =1;
        int high=m;

        while(low<=high){

            int mid=(low+high)/2;

            int x=1;
            for(int i=1;i<=n;i++){
                x=x*mid;
            }

            if(x == m){
                return mid;
            }
            else if(x<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return result;
    }
}