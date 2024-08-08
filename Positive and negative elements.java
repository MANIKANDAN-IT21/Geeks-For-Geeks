
class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
       for(int i=0;i<arr.size();i++){
           if(arr.get(i)>0){
               pos.add(arr.get(i));
           }
           else{
               neg.add(arr.get(i));
           }
       }
       int i=0;
       while(i<pos.size()&&i<neg.size()){
           ans.add(pos.get(i));
           ans.add(neg.get(i));
           i++;
       }
       return ans;
    }
}
   