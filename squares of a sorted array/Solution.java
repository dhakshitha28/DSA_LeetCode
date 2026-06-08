class Solution {
    public int[] sortedSquares(int[] nums) {

        int [] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;

        while(i<=j){

            if(nums[i] <= nums[j]){
                arr[index]=nums[j];
                index--;
                j--;
            }
            else{
                arr[index]=nums[i];
                index--;
                i++;
            }
        }

        return arr;
    }
}