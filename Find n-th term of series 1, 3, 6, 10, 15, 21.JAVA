class Solution {
    static int findNthTerm(int N) {
        // code here
        int out=0;
        for(int i=1;i<=N;i++){
            out=i+out; 
        }
        return out;
    }
};