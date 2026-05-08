class Solution {
    public int majorityElement(int[] nums) {


        List<Integer> value=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(! value.contains(nums[i])){
                value.add(nums[i]);
            }
        }

        int result=0;
        int max=0;
        for(int i=0;i<value.size();i++){
            if(map.get(value.get(i))>max){
                result=value.get(i);
                max=map.get(nums[i]);
            }
        }

        return result;

    }
}