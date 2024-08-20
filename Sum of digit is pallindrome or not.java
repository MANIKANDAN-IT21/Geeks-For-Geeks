class Solution {
    int isDigitSumPalindrome(int n) {
        
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=rem+sum;
            n/=10;
        }
        int rev=0;
        int sum2=sum;
        while(sum!=0){
            int rem=sum%10;
            rev=(rev*10)+rem;
            sum/=10;
        }
        if(rev==sum2)
            return 1;
        else
        return 0;
    }
}