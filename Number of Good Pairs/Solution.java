class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count=0;

        for(int i=0;i<nums.length;i++){

            int x=nums[i];
            map.put(x,map.getOrDefault(x,0)+1);

        }

        for(Integer key : map.keySet()) {

            if(map.get(key) > 1) {
                int x=map.get(key);
                int value=x*(x-1);
                count+=value/2;
            }
        }

        return count;
    }
}