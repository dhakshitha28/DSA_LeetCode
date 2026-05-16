class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {

        int result = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            int x = arr[i];

            if(x < min){
                min = x;
            }

            if(x > max){
                max = x;
            }
        }

        int[] num = new int[max + 1];

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            int x = arr[i];

            num[x] = 1;
        }

        for(int i = min; i <= max; i++) {

            if(num[i] == 1){
                count++;
            }
            else{

                if(count > result){
                    result = count;
                }

                count = 0;
            }
        }

        result = Math.max(result, count);

        return result;
    }
}