class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // we have to calculated the first part of the sum with the help of for loop

        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        double maxValue=sum/k;

        for(int i=k;i<nums.length;i++){

            sum=sum-nums[i-k]+nums[i];

            maxValue=Math.max(sum/k,maxValue);
        }

        return maxValue;
    }
}