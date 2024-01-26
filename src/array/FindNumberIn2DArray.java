package array;

public class FindNumberIn2DArray {

    public static void main(String[] args) {
        FindNumberIn2DArray fd = new FindNumberIn2DArray();
        Boolean item = fd.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}} , 10);
        System.out.println(""+item);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n ; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][m-1]){
               return binarySearch(matrix[i] , target);
            }
        }
        return false;
    }

    static Boolean binarySearch(int[] matrix , int target) {
        int low = 0;
        int high = matrix.length-1;

        while (low <= high){
            int mid = (low+high)/2;
            if(target == matrix[mid]) return true;
            else if (target > matrix[mid]) {
                low = mid+1;
            }else {
                high = mid -1;
            }
        }

        return false;
    }
}
