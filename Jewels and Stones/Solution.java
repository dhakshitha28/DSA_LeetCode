class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < jewels.length(); i++){
            map.put(jewels.charAt(i), 0);
        }

        for(int i = 0; i < stones.length(); i++){
            if(map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
            }
        }

        int count = 0;

        for(Character i : map.keySet()){
            count += map.get(i);
        }

        return count;
    }
}