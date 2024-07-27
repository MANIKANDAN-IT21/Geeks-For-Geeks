class Solution {

    public void sortIt(Long arr[]) {
        ArrayList<Long> odd=new ArrayList<Long>();
        ArrayList<Long> even=new ArrayList<Long>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
            odd.add(arr[i]);
            else
            even.add(arr[i]);
        }
        
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        
        for(int i=0;i<odd.size();i++){
            arr[i]=odd.get(i);
        }
        int k=0;
        for(int i=odd.size();i<arr.length;i++){
            arr[i]=even.get(k);
            k++;
        }
    }
}   