public class nk211 {
    public static void display(boolean b[][]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]){
                    System.out.print("K");
                }
                else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
    public static void knight(boolean b[][],int r ,int c){
if(b.length==r&&c==b[0].length){
    display(b);
    return;
}
if(r>=b.length||c>=b[0].length){
    return;
}

b[r][c]=true;
knight(b,r+2,c+1);
knight(b, r-2, c+1);
knight(b, r+2, c-1);
knight(b, r-2, c-1);
b[r][c]=false;

    }
    public static void main(String[] args) {
        int n=4;
        boolean b[][]=new boolean[n][n];
        knight(b,0,0);
    }
}
