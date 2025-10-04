import java.util.Arrays;

public class quicksort1{
    public static void qs(int a[],int s,int e){
        if(s<e){
            int p=partition(a,s,e);
            qs(a,s,p-1);
            qs(a,p+1,e);

        }

    }

    public static int  partition(int an[], int l, int h){
        int p=an[h];
        int i=l-1;
      for(int j=l;j<h;j++){
        if(an[j]<=p){
            i++;
            int temp=an[i];
            an[i]=an[j];
            an[j]=temp;
        }
      }
      int temp=an[i+1];
      an[i+1]=an[h];
      an[h]=temp;
      return i+1;

    }
        public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7,0};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}