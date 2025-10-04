import java.util.Arrays;
public class quicksort2 {
    static int t=0;
    public static void qs(int a[],int s,int e){
        if(s<e){
            
            int p=part(a,s,e);
            System.out.println(Arrays.toString(a)+"for i="+(++t));
            qs(a,s,p-1);
            System.out.println(Arrays.toString(a)+"for j="+(++t));
            qs(a,p+1,e);
            System.out.println(Arrays.toString(a)+"for k="+(++t));

        }
    }
    public static int part(int a[],int l,int h){
        System.out.println("part l="+l+"part h"+h);
        int pivot=a[h];
        System.out.println("p="+pivot+"for i="+t);

        int i=l-1;
        System.out.println("i="+i);
        for(int j=l;j<h;j++){
            if(a[j]<=pivot){
                ++i;//i++

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                System.out.println(Arrays.toString(a)+"for =in");

            }
        }
        int t= a[i+1];
        a[i+1]=a[h];
        a[h]=t;
        System.out.println("ii n"+(i));
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {9,5,3,6,1,7,2,8,4};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
