import java.util.Arrays;

public class Cyclesort {
    public static void cycle(int a[]) {
        int n = a.length;
        int s = 0;
        while (s < n) {
            int i = a[s];
            if (i >= 0 && i < n && a[i] != a[s]) {
                int temp = a[s];
                a[s] = a[i];
                a[i] = temp;

            } else {
                s++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 9, 7, 0 };
        System.out.println(Arrays.toString(arr));
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("the index where no is missing is ");
        // System.out.println(Arrays.toString(miss(arr)));
    }
}
