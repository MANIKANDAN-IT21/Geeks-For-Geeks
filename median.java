class Solution
{
    public int find_median(int[] v)
    {
       Arrays.sort(v);
       int left=0;
       int right=v.length-1;
       
       if(v.length%2!=0){
           int mid=(left+right)/2;
           return v[mid];
       }
       else{
           int mid = (v[right / 2] + v[right / 2 + 1]) / 2;
           return mid;
       }
    }
}