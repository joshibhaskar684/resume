import java.util.Arrays;

public class mergesort {
    static int y=8;
    static int z=8;
public static int [] merges(int a[]){
    
    if(a.length==1){
        return a;
    }
    int mid=a.length/2;

    
    int left[]=merges(Arrays.copyOfRange(a,0,mid));
    System.out.println("for mid ="+mid);
    System.out.println(Arrays.toString(left)+""+"for le "+(--y));
    int right[]=merges(Arrays.copyOfRange(a,mid,a.length));
    System.out.println(Arrays.toString(right)+""+"for ri "+(--z));
    // int mid=(s+e)/2;
    // int left[]=merges(a,s,mid);
    // int right[]=merges(a,mid+1,e);
    // int result[]=merge(left,right);
    return merge(left,right);
}
public static int[] merge(int l[],int r[]){
    
    System.out.println("final left array"+Arrays.toString(l));
    
    System.out.println("final rit array"+Arrays.toString(r));
    int temp[]=new int[l.length+r.length];
   int i=0,j=0,k=0;
   while (i<l.length&&j<r.length) {
    if (l[i] <= r[j]) {
        temp[k] = l[i];
        i++;
    }
    else {
        temp[k] = r[j];
        j++;
    }
    k++;
    }
    while (i < l.length) {
        temp[k] = l[i];
        i++;
        k++;

    }
    while (j < r.length) {
        temp[k] = r[j];
        j++;
        k++;
    }
    System.out.println("for temp="+Arrays.toString(temp));
    return temp;
   }

  
    public static void main(String[] args) {
        int arr[]={4,5,3,8,9,11,1,2};
       arr=merges(arr);
        System.out.println(Arrays.toString(arr));
        ///exp
        //
        int y[]={1,3,0,2,4,5,6,7,8,9};
        int l[]=Arrays.copyOfRange(y,4,y.length);
        System.out.println(Arrays.toString(l));
        
    }
}
