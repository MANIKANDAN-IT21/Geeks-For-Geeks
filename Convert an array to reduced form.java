import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int size=5;
        int[] arr=new int[size];
        int[] arr2=new int[size];
        int[] temp=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
            temp[i]=arr[i];
        }
        
      Arrays.sort(arr);
    //   System.out.println(arr);
     for(int i=0;i<size;i++){
         for(int j=0;j<size;j++){
         if(temp[i]==arr[j]){
             arr2[i]=j;
            //  break;
         }
         }
        }
        for(int i=0;i<size;i++){
             System.out.print(arr2[i]+" ");
        }
    }
}