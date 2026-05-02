class Solution {
    public int removeDuplicates(int[] nums) {
// using 2 pointer
        int i=0;
        int result =1;

        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[result]=nums[j];
                result++;
            }
            i++;
        }


        return result;
    }
}