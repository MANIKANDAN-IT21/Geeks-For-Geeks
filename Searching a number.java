class Solution {
    public static int search(int n, int k, int[] arr) {
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==k){
                return i;
            }
        }
        return -1;
    }
}