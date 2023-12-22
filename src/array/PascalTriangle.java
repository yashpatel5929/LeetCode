package array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle ps = new PascalTriangle();
       System.out.println(ps.generate(5));

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i= 1 ; i <= numRows ; i++) {
            list.add(generateList(i));
        }

        return list;
    }

    static List<Integer> generateList(int row) {
        List<Integer> list = new ArrayList<Integer>();
        int ans = 1;
        list.add(ans);
        for(int col =1; col < row ; col++){
            ans = ans * (row-col);
            ans = ans / (col);
            list.add(ans);
        }

        return list;
    }
}
