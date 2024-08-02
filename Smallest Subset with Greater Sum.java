class Solution { 
    int minSubset(int[] Arr,int N) {
        Arrays.sort(Arr);
        long total=0;
        long current=0;
        int count=0;
        for(int i=0;i<N;i++){
            total=Arr[i]+total;
        }
        for(int i=N-1;i>=0;i--){
            current=current+Arr[i];
            count++;
            if(current>total-current){
                return count;
            }
        }
        return count;
    }
}