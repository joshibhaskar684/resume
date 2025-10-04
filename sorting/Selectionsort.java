import java.util.Arrays;

public class Selectionsort {
    public static int findmin(int ar[],int start,int nn){
        int min = start;
        for(int i=start;i<nn;i++){
            if(ar[min]>ar[i]){
                min = i;

            }
        }
        return min;
    }
    public static void selectionsor(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min=findmin(a,i,n);
            if(a[i]!=a[min]){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,45};
          System.out.println("original array:\n"+Arrays.toString(arr));
        selectionsor(arr);
        System.out.println("final array\n"+Arrays.toString(arr));
   
    }
}
