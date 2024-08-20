class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<=10;i++){
            arr.add(i*N);
        }
        return arr;
    }
}