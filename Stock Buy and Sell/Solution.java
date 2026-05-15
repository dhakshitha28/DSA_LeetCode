class Solution {
    public int maxProfit(int[] prices) {

        int result=0;
        int min=prices[0];

        for(int i=1;i<prices.length;i++){
            int x=prices[i];

            if(x < min ){
                min=x;
            }
            int ans=x-min;
            if(ans>result){
                result=ans;
            }
        }

        return result;
    }
}