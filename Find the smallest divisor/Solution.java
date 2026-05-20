class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }

        int low=1;
        int high=max;

        while(low<high){
            int mid=(low+high)/2;
            int x=sumOfArrayValue(nums,mid);

            if(x > threshold){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }

        return low;

    }

    public int sumOfArrayValue(int [] nums,int divisor){
        double total=Math.ceil((double)nums[0]/(double)divisor);

        for(int i=1;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/(double)divisor);
        }

        return (int)total;
    }

}