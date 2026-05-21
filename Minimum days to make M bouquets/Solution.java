class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length){
            return -1;
        }

        int low = bloomDay[0];
        int high = bloomDay[0];

        for(int i = 1; i < bloomDay.length; i++){

            int x = bloomDay[i];

            if(x < low){
                low = x;
            }

            if(x > high){
                high = x;
            }
        }

        int result = high;

        while(low <= high){

            int mid = (low + high) / 2;

            boolean isTheBouquetCanAbleToMakeInThisDay =possible(bloomDay, mid, m, k);

            if(isTheBouquetCanAbleToMakeInThisDay){

                result = mid;
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return result;
    }

    public boolean possible(int arr[], int date, int noOfBouquet, int noOfFlowerInOneBouquet){

        int countOfAdjacentFlower = 0;
        int noOfBouquetCanAbleToForm = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] <= date){
                countOfAdjacentFlower++;
            }

            else{

                noOfBouquetCanAbleToForm += (countOfAdjacentFlower / noOfFlowerInOneBouquet);
                countOfAdjacentFlower = 0;
            }
        }

        noOfBouquetCanAbleToForm += (countOfAdjacentFlower / noOfFlowerInOneBouquet);

        if(noOfBouquet <= noOfBouquetCanAbleToForm){
            return true;
        }

        return false;
    }
}