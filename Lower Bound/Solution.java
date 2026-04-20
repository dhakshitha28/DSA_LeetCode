import java.util.*;
class Solution {
    int lowerBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while(high >= low){

            int mid = (low + high) / 2;

            if(arr[mid] >= target){

                while (mid > 0 && arr[mid - 1] >= target){
                    mid--;
                }

                return mid ;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
        }

        return arr.length;
    }
}
