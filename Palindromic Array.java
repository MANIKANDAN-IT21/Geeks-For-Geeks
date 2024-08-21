class Solution {
    public static boolean pali(int arr){
        int rev=0;
        int ar=arr;
        while(arr!=0){
            int rem=arr%10;
            rev=(rev*10)+rem;
            arr/=10;
        }
        if(rev==ar){
            return true;
        }
        return false;
    }
    public static boolean palinArray(int[] arr) {
        // add code here.
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(pali(arr[i]))
            count++;
        }
        if(count==arr.length){
            return true;
        }
        return false;
    }
}