class Solution {
    public long[] findElements(long arr[]) {
        int n=arr.length-2;
        Arrays.sort(arr);
        long[] res=new long[n];
        for(int i=0;i<n;i++){
            res[i]=arr[i];
        }
        return res;
    }
}