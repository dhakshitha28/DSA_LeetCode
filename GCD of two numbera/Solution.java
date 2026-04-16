class Solution {
    public static int gcd(int a, int b) {
        // code here
        int num =a;
        if(a>b){
            num=b;
        }

        int gcd=1;
        for(int i=2;i<=num;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }

        return gcd;

    }
}
