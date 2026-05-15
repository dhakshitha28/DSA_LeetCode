class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here

        ArrayList<Integer> temp=new ArrayList<>();

        int n=arr.length-1;

        int leaderElement=arr[n];
        temp.add(leaderElement);

        for(int i=n-1;i>=0;i--){

            int x=arr[i];

            if(x >=leaderElement){

                leaderElement=x;
                temp.add(leaderElement);

            }
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=temp.size()-1;i>=0;i--){
            result.add(temp.get(i));
        }

        return result;
    }
}
