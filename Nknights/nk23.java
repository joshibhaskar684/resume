public class nk23 {
    public static void display(boolean b[][]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]){
                    System.out.print(" k ");
                }
                else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
    public static boolean issafe(boolean b[][],int r, int c){
        if(vailds(b, r-1, c-2)){
            if(b[r-1][c-2]){
                return false;
            }
        }
        if(vailds(b, r-1, c+2)){
            if(b[r-1][c+2]){
                return false;
            }
        }
        if(vailds(b, r-2, c+2)){
            if(b[r-2][c+2]){
                return false;
            }
        }
        if(vailds(b, r-2, c-1)){
            if(b[r-2][c-1]){
                return false;
            }
        }

        ////////
        return true;
    }
    public static boolean vailds(boolean b[][],int r , int c){
        if(r>=0&&r<=b.length&&c>=0&&c<b.length){
            return true;
        }
        return false;
    }
    public static void knight(boolean b[][],int r,int c, int n){
        if(n==0){
            display(b);
            return;
        }
        if(r==b.length-1&&c==b.length){
            return;
        }
        if(c==b.length){
            knight(b,r+1,0,n);
            return;
        }
       if(issafe(b,r,c)){
        b[r][c]=true;
        knight(b,r,c+1,n-1);
        b[r][c]=false;
       }
       knight(b,r,c+1,n);
    }
    public static void main(String[] args) {
        int n=4; 
        boolean b[][]=new boolean [n][n];
        knight(b,0,0,n);

    }
}
