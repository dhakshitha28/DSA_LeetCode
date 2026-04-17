class Solution {
    public static int largest(int[] arr) {
        // code here
        int result =arr[0];
        for(int i=1;i<arr.length;i++){
            if(result < arr[i]){
                result=arr[i];
            }
        }
        return result;
    }
}
