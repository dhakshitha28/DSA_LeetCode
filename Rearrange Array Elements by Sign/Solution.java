class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> pNum=new ArrayList<>();
        ArrayList<Integer> nNum=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pNum.add(nums[i]);
            }
            else{
                nNum.add(nums[i]);
            }
        }

        int [] result= new int [nums.length];
        int j=0;
        for(int i=0;i<nums.length;i+=2){
            result[i]=pNum.get(j);
            result [i+1]=nNum.get(j);
            j++;
        }

        return result;
    }
}