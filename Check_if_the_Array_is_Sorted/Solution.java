class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean result =true;
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){

            if(arr[i]>arr[i+1]){

                result=false;
                break;

            }
        }

        return result;
    }
}