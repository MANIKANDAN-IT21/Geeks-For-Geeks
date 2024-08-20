class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        int d=a2-a1;
        int an=0;
        for(int i=0;i<n;i++){
            an=a1+(n-1)*d;
        }
        return an;
    }
}