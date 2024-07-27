class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        if(arr1.length!=arr2.length){
            return false;
        }
        int count=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
}