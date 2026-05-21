class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low=weights[0];
        int high=weights[0];

        for(int i=1;i<weights.length;i++){
            if(low<weights[i]){
                low=weights[i];
            }
            high+=weights[i];
        }
        int result=high;

        while(low<=high){
            int mid=(low+high)/2;
            boolean isThisMinCapacity=possible(weights,mid,days);

            if(isThisMinCapacity){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return result;

    }

    public boolean possible(int[] arr, int capacity, int days){

        int countOfTheDays = 1;
        int minCapacity = 0;

        for(int i = 0; i < arr.length; i++){

            if(minCapacity + arr[i] <= capacity){

                minCapacity += arr[i];
            }

            else{

                countOfTheDays++;

                minCapacity = arr[i];
            }
        }

        if(countOfTheDays <= days){
            return true;
        }

        return false;
    }

}