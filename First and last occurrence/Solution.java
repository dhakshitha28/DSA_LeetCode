class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] arr={-1,-1};
        if(nums.length==1 && nums[0]==target){
            arr[0]=0;
            arr[1]=0;
            return arr;
        }

        int low=0;
        int high=nums.length-1;

        while(low <= high){
            int mid=(low + high)/2;

            if(nums[mid]==target){
                int first=mid;
                int last=mid;

                while(first>0 && nums[first]==nums[first-1]){
                    first--;
                }
                while(last<nums.length-1 && nums[last]==nums[last+1]){
                    last++;
                }
                arr[0]=first;
                arr[1]=last;
                return arr;
            }
            else if(nums[mid] < target){
                low= mid +1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
        }

        return arr;
    }
}