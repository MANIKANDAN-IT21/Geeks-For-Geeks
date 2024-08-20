class Solution{
    static List<Integer> get(int a,int b)
    {
       ArrayList<Integer> arr=new ArrayList<>();
       a=a^b;
       b=a^b;
       a=a^b;
       arr.add(a);
       arr.add(b);
       return arr;
    }
}