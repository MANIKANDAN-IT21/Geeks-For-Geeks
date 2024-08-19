class Solution {
    public static long seriesSum(int n) {
        // code here
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}