
class Solution {
    
    public long leftElement(long arr[], long n) {
        Arrays.sort(arr);
    
        int mid = (int)((n - 1) / 2);
        
   
        return arr[mid];
    }
}
