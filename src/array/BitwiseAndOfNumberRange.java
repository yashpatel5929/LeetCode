package array;

public class BitwiseAndOfNumberRange {
    public static void main(String[] args) {
        BitwiseAndOfNumberRange bitwiseAndOfNumberRange = new BitwiseAndOfNumberRange();
        int res = bitwiseAndOfNumberRange.rangeBitwiseAnd(1,2147483647);
        System.out.println(""+res);
    }
    public int rangeBitwiseAnd(int left, int right) {
        String itm = Integer.toBinaryString(left);
        int ans = left;
        for(int i = left+1 ; i < right ; i++) {
            ans = ans & i;
        }
        return ans;

    }
}
