public class nk221 {
    public static void display(boolean b[][]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j]) {
                    System.out.print(" K ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean safe(boolean b[][], int r, int c) {
        if (isValid(b, r - 2, c - 1)) {
            if (b[r - 2][c - 1]) {
                return false;
            }
        }
        if (isValid(b, r - 1, c - 2)) {
            if (b[r - 1][c - 2]) {
                return false;
            }
        }
        if (isValid(b, r - 2, c + 1)) {
            if (b[r - 2][c + 1]) {
                return false;
            }
        }
        if (isValid(b, r - 1, c + 2)) {
            if (b[r - 1][c + 2]) {
                return false;
            }
        }
        return true; // Position is safe
    }

    public static boolean isValid(boolean b[][], int r, int c) {
        if (r >= 0 && r < b.length && c >= 0 && c < b.length) {
            return true;
        }
        return false;
    }

    public static void knight(boolean b[][], int r, int c, int t) {
        if (t == 0) {
            display(b);
            return;
        }
        if (r >= b.length) {
            return;
        }
        if (c == b.length) {
            knight(b, r + 1, 0, t);
            return;
        }
        if (safe(b, r, c)) {
            b[r][c] = true;
            knight(b, r, c + 1, t - 1);
            b[r][c] = false;
        }
        knight(b, r, c + 1, t);
    }

    public static void main(String[] args) {
        int n = 4; // Board size (n x n) and number of knights
        boolean b[][] = new boolean[n][n];
        knight(b, 0, 0, n);
    }
}
