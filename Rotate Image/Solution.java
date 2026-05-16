class Solution {
    public void rotate(int[][] matrix) {

        //For the optimal solution we have to transpose the matri array first

        int n= matrix.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                //swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //nxt we want to reveser the row

        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;

            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}