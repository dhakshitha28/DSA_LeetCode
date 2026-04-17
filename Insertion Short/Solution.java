class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here

        for(int i=1;i<arr.length;i++){

            int value=arr[i];
            int index =i-1;

            while(index>=0&&arr[index]>value){

                arr[index+1]=arr[index];
                index --;
            }

            arr[index+1]=value;
        }

    }
}