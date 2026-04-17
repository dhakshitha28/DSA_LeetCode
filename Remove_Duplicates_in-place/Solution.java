class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(! result.contains(arr[i])){
                result.add(arr[i]);
            }
        }

        return result;
    }
}
