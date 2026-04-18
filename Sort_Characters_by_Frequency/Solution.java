class Solution {
    public String frequencySort(String s) {

        String result = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        while (true) {
            char value = Solution.max(map);
            if (!map.containsKey(value) || map.get(value) == 0) {
                break;
            }
            result = result + String.valueOf(value).repeat(map.get(value));
            map.put(value, 0);
        }

        return result;
    }

    public static char max(Map<Character, Integer> map) {
        int max = 0;
        char result = ' ';

        for (char key : map.keySet()) {
            int value = map.get(key);

            if (value > max) {
                max = value;
                result = key;
            }
        }

        return result;
    }
}