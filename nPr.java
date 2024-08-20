class Solution{
    public static long fact(long a){
        long fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    static long nPr(long n, long r){
        // code here
        long ans=fact(n)/fact(n-r);
        return ans;
    }
}