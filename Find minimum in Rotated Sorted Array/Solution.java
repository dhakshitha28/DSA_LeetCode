class Solution {
    public int findMin(int[] n) {

        int low=0;
        int high=n.length-1;
        int min=n[0];

        while(low<=high){
            int mid = (low + high)/2;

            if(n[mid] < min){
                min=n[mid];
            }
            else if(n[mid] > n[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return min;
    }
}