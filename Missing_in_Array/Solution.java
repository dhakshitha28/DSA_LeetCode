class Solution {
    int missingNum(int arr[]) {
        // code here

        for(int i=1;i<=arr.length+1;i++){
            boolean  theValueIsNotAvailable=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    theValueIsNotAvailable=false;
                    break;
                }
            }

            if(theValueIsNotAvailable){
                return i;
            }

        }
        return -1;
    }
}