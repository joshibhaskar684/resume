public class nqp2 {
    public static void display(boolean b[][])
    {
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]){
                    System.out.print(" X ");
                }
                else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(boolean b[][],int r,int c){
        //checking up
        for(int i=0;i<r;i++){
                if(b[i][c]){
                    return false;
                }
            }
            int maxleft=Math.min(r,c);
            for(int i=0;i<=maxleft;i++){
                if(b[r-i][c-i]){
                    return false;
                }
            }
            int maxright=Math.min(r,b.length-c-1);
            for(int i=0;i<=maxright;i++){
                if(b[r-i][c+i]){
                    return false;
                }
            }
            return true;
        }
    
    public static int nqueen(boolean b[][],int r){
        if(b.length==r){
            display(b);
            return 1;
        }
        int count =0;
        for(int c=0;c<b.length;c++){
            if(isSafe(b,r,c)){
                b[r][c]=true;
                count+=nqueen(b,r+1);
                b[r][c]=false;
            }
        }

return count;

    }

    public static void main(String[] args) {
        int n=4;
        boolean b[][]=new boolean[n][n];
      System.out.println(nqueen(b, 0));
        

    }
}
