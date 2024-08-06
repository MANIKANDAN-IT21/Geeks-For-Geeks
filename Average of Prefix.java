class Solution {
    // Prints average of a stream of numbers
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> arrr=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
                arrr.add(sum/(i+1));
        }
        return arrr;
    }
}