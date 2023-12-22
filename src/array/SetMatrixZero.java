package array;

public class SetMatrixZero {
    public static void main(String[] args) {
        SetMatrixZero setMatrixZero = new SetMatrixZero();
        setMatrixZero.setMatrixZeroBetterApproach(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }

    public void setZeroes(int[][] matrix) {
        // this is logic is perfect and working fine until it doesn't contain negative
        // number in matrix.
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        for(int i= 0 ; i < rowlen; i++) {
            for(int j = 0 ; j < collen ; j++) {
                if(matrix[i][j] != 0) continue;

                for(int row = 0; row < rowlen ; row++) {
                    if(matrix[row][j] != 0) {
                        matrix[row][j] = -1;
                    }
                }

                for(int col = 0; col < collen ; col++) {
                    if(matrix[i][col] != 0) {
                        matrix[i][col] = -1;
                    }
                }
            }
        }

        for(int i= 0 ; i < rowlen; i++) {
            for(int j = 0 ; j < collen ; j++) {
                if(matrix[i][j] == -1) {
                    matrix[i][j] = 0;

                }
                System.out.print(" "+matrix[i][j]);
            }
        }
    }

    public void setMatrixZeroBetterApproach(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        int[] dumyRow = new int[rowlen];
        int[] dummyCol = new int[collen];

        for(int i=0; i< rowlen;i++) {
            for(int j=0; j < collen ; j++) {
                if(matrix[i][j] == 0) {
                    dumyRow[i] = 1;
                    dummyCol[j] = 1;
                }
            }
        }

        for(int i=0; i< rowlen;i++) {
            for(int j=0; j < collen ; j++) {
                if(dumyRow[i] == 1 || dummyCol[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i= 0 ; i < rowlen; i++) {
            for(int j = 0 ; j < collen ; j++) {
                System.out.print(" "+matrix[i][j]);
            }
        }
    }
}
