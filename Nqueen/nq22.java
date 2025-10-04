public class nq22 {
    public static void display(boolean b[][]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]){
                    System.out.print(" K ");
                }
                else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void  nqueen(boolean[][] b,int r)
{
    if(b.length==r){
        display(b);
        return;
    }
    for(int c=0;c<b[0].length;c++){

        if(issafe(b,r,c)){
            b[r][c]=true;
            nqueen(b,r+1);
            b[r][c]=false;
        }
    }
    }
    public static boolean issafe(boolean b[][],int r, int c){
        for(int i=0;i<r;i++){
            if(b[i][c]){
                return false;
            }
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j]) {
                return false;
            }
        }
    
        // Check upper-right diagonal
        for (int i = r - 1, j = c + 1; i >= 0 && j < b.length; i--, j++) {
            if (b[i][j]) {
                return false;
            }
        }


        return true ;

    }
    public static void main(String[] args) {
        int n=4;
        boolean b[][]=new boolean[n][n];
        nqueen(b,0);
    }
}
