    class Solution {
        public static int missingNumber(int n, int[] arr) {
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++){
                if(arr[i]!=i+1){
                    return i+1;
                }
            }
            return n;
        }
    }