public class nk241 {
   public static int count=0;
        public static void display(boolean b[][]){
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){
                    if(b[i][j]){
                        System.out.print(" K ");
                    }
                    else{
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        public static boolean issafe(boolean b[][],int r, int c){
           
            if(isvaild(b,r-1,c+2)){
                if(b[r-1][c+2]){
                    return false;
                }
            }
            if(isvaild(b,r-1,c-2)){
                if(b[r-1][c-2]){
                    return false;
                }
            }
            if(isvaild(b,r-2,c+2)){
                if(b[r-2][c+2]){
                    return false;
                }
            }
            if(isvaild(b,r-2,c-1)){
                if(b[r-2][c-1]){
                    return false;
                }
            }
    //////////////////////////////////////////////////////////////////////////
    /// 
    /// 
    
    if(isvaild(b,r+1,c+2)){
        if(b[r+1][c+2]){
            return false;
        }
    }
    if(isvaild(b,r+1,c-2)){
        if(b[r+1][c-2]){
            return false;
        }
    }
    if(isvaild(b,r+2,c+1)){
        if(b[r+2][c+1]){
            return false;
        }
    }
    if(isvaild(b,r+2,c-1)){
        if(b[r+2][c-1]){
            return false;
        }
    }
    
            return true;
    
        }
        public static boolean isvaild(boolean b[][],int r,int c){
            if(r>=0&&c>=0&&r<b.length&&c<b.length){
                return true;
            }
            return false;
        }
       
        public static void knight(boolean b[][],int r, int c,int k){
            if(k==0){
                count+=1;
                display(b);
                return;
            }
            if(r==b.length-1&&c==b.length){
                return;
            }
            if(c==b.length){
                knight(b,r+1,0,k);
                return;
            }
            if(issafe(b,r,c)){
                b[r][c]=true;
                knight(b,r,c+1,k-1);
                b[r][c]=false;
            }
            knight(b,r,c+1,k);
        }
        public static void main(String[] args) {
            int n = 4;
            boolean b[][] = new boolean[n][n];
            int c=0;
            knight(b, 0, 0, n);
            System.out.println(count);
            
        
        }
    
    
}
