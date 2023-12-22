package array;

public class SpecialPositionInMatrix {
    public static void main(String[] args) {
        SpecialPositionInMatrix sp = new SpecialPositionInMatrix();
        sp.numSpecial(new int[][]{{0,0,0,1},{1,0,0,0},{0,1,1,0},{0,0,0,0}});
    }

    public int numSpecial(int[][] mat) {
        int ans = 0;
        int m = mat.length;
        int n = mat[0].length;

        for(int row = 0 ; row < m ; row++) {
            for(int col = 0 ; col < n ; col++) {
                if(mat[row][col] == 0) continue;
                Boolean good = true;
                for(int r=0 ; r < m ; r++) {
                    if(r != row && mat[r][col] == 1) {
                        good = false;
                        break;
                    }
                }

                for(int c=0;c<n;c++) {
                    if(c != col && mat[row][c] == 1) {
                        good = false;
                        break;
                    }
                }

                if(good) ans++;
            }
        }

        System.out.println(""+ans);
        return ans;


    }
}
