class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
         if(arr.length==1){
            return new int[] {-1};
        }
        int small=Integer.MAX_VALUE;
        int small2=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
          if(arr[i]<small){
              small2 = small;
              small = arr[i];
          }
           else if(arr[i]<small2 && small!=arr[i]){
                small2=arr[i];
            }
        }
        if(small2==Integer.MAX_VALUE){
            return new int[]{-1};
        }
        
        return new int[]{small, small2};
        
    }
}
