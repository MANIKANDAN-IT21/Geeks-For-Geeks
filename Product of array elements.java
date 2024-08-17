class Solution {
    public static long product(long arr[]) {
        // your code here
        long mul=1;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            mul=(mul*arr[i])%mod;
        }
        return mul;
    }
}
