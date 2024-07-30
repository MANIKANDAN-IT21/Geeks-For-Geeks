class Solution {
    public static int maxProduct(int[] arr) {
    int a=0;
    int b=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>a){
            b=a;
            a=arr[i];
        }
        else if(arr[i]>b)
        b=arr[i];
    }
    return a*b;
    }
    
}
