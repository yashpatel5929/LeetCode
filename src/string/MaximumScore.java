package string;

public class MaximumScore {
    public static void main(String[] args) {
        MaximumScore max = new MaximumScore();
        int score = max.maxScore("1111");
        System.out.println(""+score);
    }
    public int maxScore(String s) {
        int maxCount = 0;
        for(int i = 1 ; i <s.length() ; i++) {
            int zeroCount = countZeros(s.substring(0,i));
            int onesCount = countOnes(s.substring(i,s.length()));
            int add = zeroCount+onesCount;
            if(add > maxCount)
                maxCount = add;
        }

        return maxCount;

    }

    public static int countZeros(String s) {
        int count = 0;
        for(int i=0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '0') {
                count++;
            }
        }

        return count;
    }

    public static int countOnes(String s) {
        int count = 0;
        for(int i=0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }

}
