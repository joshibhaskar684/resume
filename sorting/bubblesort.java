import java.util.Arrays;

public class bubblesort{

    public static void bubblesor(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                }
            }
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("original array:\n"+Arrays.toString(arr));
        bubblesor(arr);
        System.out.println("final array\n"+Arrays.toString(arr));
    }
}