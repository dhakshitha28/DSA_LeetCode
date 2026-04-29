import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> value = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(!value.contains(nums[i])){
                value.add(nums[i]);
            }
        }

        int[] resultArr = new int[k];
        int j = 0;

        while(k > 0){
            int val = Solution.maxValue(map, value);
            resultArr[j] = val;
            k--;
            j++;
        }

        return resultArr;
    }

    public static int maxValue(Map<Integer,Integer> map, List<Integer> value){

        int max = value.get(0);

        for(int i = 0; i < value.size(); i++){
            if(map.get(value.get(i)) > map.get(max)){
                max = value.get(i);
            }
        }

        map.put(max, 0);

        return max;
    }
}