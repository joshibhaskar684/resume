import java.util.Arrays;

public class Insertionsort {
    public static void insertionsort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
           
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    
                }
            }
        }
    }
 public static void main(String[] args) {
    int[] arr = {12, 11, 13, 5, 6};
      System.out.println("original array:\n"+Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("final array\n"+Arrays.toString(arr));
   
 }   
}
