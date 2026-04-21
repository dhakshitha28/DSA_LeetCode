class Solution {
    int countFreq(int[] arr, int target) {

        int count = 0;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                count++;
                int first = mid;
                int last = mid;

                while(first>0 && arr[first]==arr[first-1]){
                    count++;
                    first--;
                }
                while(last<arr.length-1 && arr[last]==arr[last+1]){
                    count++;
                    last++;
                }
                return count;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
        }

        return count;
    }
}
