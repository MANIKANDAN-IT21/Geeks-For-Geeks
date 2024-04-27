class Solution {
    public static String longest(int n, String[] names) {
        int count =0;
        String first=names[0];
        for(int i=1;i<n;i++){
            String second=names[i];
            if(first.length()<second.length()){
                count=i;
                first=second;
            }
        }
        return first;
    }
}
 