import java.util.Arrays;

public class quicksort {
    public static void qs(int a[],int s,int e){
        if(s<e){
            int p=part(a,s,e);
            qs(a, s, p-1);
            qs(a, p+1, e);

        }
    }
    public static int part(int ar[],int l,int h){
        System.out.println(Arrays.toString(ar));
        int pivot=ar[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(ar[j]<=pivot){
                i++;
                int t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
            }
        }
        int t=ar[i+1];
         ar[i+1]=ar[h];
         ar[h]=t;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 1, 9,5};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
