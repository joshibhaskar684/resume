import java.util.*;

//nqueen problem 1
public class nqp {
    
    public static void display(boolean b[][]){
        for(boolean[]r:b){
            for(boolean e:r){
                if(e){
                    System.out.print(" Q ");
                }
                else{
                    System.out.print(" X");
                }

            }
            System.out.println();
        }
    }
    
    public static int  find (boolean b[][],int r){
       if(r==b.length){
      display(b);
      System.out.println();
        return 1;
       }
       int count=0;
      for(int ci=0;ci<b.length;ci++){
        if(issafe(b,r,ci)){
            b[r][ci]=true;
            count+=find(b,r+1);
            b[r][ci]=false;
        }
      }
      return count;

      }
      public static boolean issafe(boolean b[][],int r, int c){
        for(int i=0;i<r;i++){
            if(b[i][c]){
                return false;
            }
        }
        int maxleft=Math.min(r,c);
        for(int i=1;i<=maxleft;i++){
            if(b[r-i][c-i]){
                return false;
            }
        }
        int maxright=Math.min(r,b.length-c-1);
        for(int i=1;i<=maxright;i++){
            if(b[r-i][c+i]){
                return false;
            }
        }
        return true;
      }
    
    public static void main(String[] args) {
        int n=4;
        boolean b[][]=new boolean[n][n];
            System.out.println(find(b,0));
            System.out.println();

    }
}
