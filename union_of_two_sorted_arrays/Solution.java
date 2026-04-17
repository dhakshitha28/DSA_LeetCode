
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> result = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(!result.contains(a[i])){
                    result.add(a[i]);
                }
                i++;
            } else {
                if(!result.contains(b[j])){
                    result.add(b[j]);
                }
                j++;
            }
        }

        while(i < n1){
            if(!result.contains(a[i])){
                result.add(a[i]);
            }
            i++;
        }

        while(j < n2){
            if(!result.contains(b[j])){
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}