class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=piles[0];

        for(int i=0;i<piles.length;i++){
            if(high<piles[i]){
                high=piles[i];
            }
        }

        while(low <= high){

            int mid=(low+high)/2;
            int k=minEatingHours(piles,mid);

            if(k<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }

    public int minEatingHours(int [] bananas, int speed){

        double total=0;

        for(int i=0;i<bananas.length;i++){
            total=total+Math.ceil( (double)bananas[i]/ (double)speed);
        }

        return (int) total;
    }

}