
    class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        int[] arr=new int[arr2.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]+arr2[arr2.length-i-1]<k){
                return false;
            }
        }
       return true;
    }
}