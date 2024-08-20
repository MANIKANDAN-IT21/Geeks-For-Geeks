class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        // Code here
        long sum=0;
        if(n==1){
            return 2*2;
        }
        for(long i=1;i<=n*2;i++){
            if(i%2==0){
                sum=(i*i)+sum;
            }
        }
        return sum;
    }
}