public class nk231 {
    public static void display(boolean b[][]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j]) {
                    System.out.print(" k ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean issafe(boolean b[][], int r, int c) {
        if (vailds(b, r - 1, c - 2) && b[r - 1][c - 2]) {
            return false;
        }
        if (vailds(b, r - 1, c + 2) && b[r - 1][c + 2]) {
            return false;
        }
        if (vailds(b, r - 2, c + 1) && b[r - 2][c + 1]) {
            return false; // Corrected r-2, c+1
        }
        if (vailds(b, r - 2, c - 1) && b[r - 2][c - 1]) {
            return false;
        }
        return true;
    }

    public static boolean vailds(boolean b[][], int r, int c) {
        return r >= 0 && r < b.length && c >= 0 && c < b.length;
    }

    public static int knight(boolean b[][], int r, int c, int n) {
        int count = 0;
        if (n == 0) {
            display(b);
            return 1;
        }

        if (r == b.length && c == b.length) { // Corrected condition
            return 0;
        }

        if (c == b.length) {
            count += knight(b, r + 1, 0, n);
        }

        if (issafe(b, r, c)) {
            b[r][c] = true;
            count += knight(b, r, c + 1, n - 1);
            b[r][c] = false;
        }

        count += knight(b, r, c + 1, n);
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean b[][] = new boolean[n][n];
        System.out.println(knight(b, 0, 0, n));
    }
}









// public class nk231 {
//     public static void display(boolean b[][]){
//         for(int i=0;i<b.length;i++){
//             for(int j=0;j<b[i].length;j++){
//                 if(b[i][j]){
//                     System.out.print(" k ");
//                 }
//                 else{
//                     System.out.print(" O ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();

//     }
//     public static boolean issafe(boolean b[][],int r, int c){
//         if(vailds(b, r-1, c-2)){
//             if(b[r-1][c-2]){
//                 return false;
//             }
//         }
//         if(vailds(b, r-1, c+2)){
//             if(b[r-1][c+2]){
//                 return false;
//             }
//         }
//         if(vailds(b, r-2, c+2)){
//             if(b[r-2][c+2]){
//                 return false;
//             }
//         }
//         if(vailds(b, r-2, c-1)){
//             if(b[r-2][c-1]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean vailds(boolean b[][],int r , int c){
//         if(r>=0&&r<=b.length&&c>=0&&c<b.length){
//             return true;
//         }
//         return false;
//     }
//     public static int  knight(boolean b[][],int r,int c, int n){
//         int count=0;
//         if(n==0){
//             display(b);
            
//             return 1;
//         }
//         if(r==b.length-1&&c==b.length){
//             return 0;
//         }
//         if(c==b.length){
//            count+=knight(b,r+1,0,n);

//         }
//        if(issafe(b,r,c)){
//         b[r][c]=true;
//         count+=knight(b,r,c+1,n-1);
//         b[r][c]=false;
//        }
//         count+=knight(b,r,c+1,n);
//         return count;
//     }
//     public static void main(String[] args) {
//         int n=4; 
//         boolean b[][]=new boolean [n][n];
//         System.out.println(knight(b,0,0,n));
//     }
// }
