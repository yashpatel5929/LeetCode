package string;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        LongestPalindromeSubstring lcs = new LongestPalindromeSubstring();
        System.out.println(""+lcs.longestPalindrome("bb"));
    }
    public String longestPalindrome(String s) {

        String res ="";
        int resLength = 0;

        for(int i = 0; i< s.length() ; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if((r-l+1) > resLength) {
                    res = s.substring(l,r+1);
                    resLength = r-l+1;
                }
                l--;
                r++;
            }

            l = i ; r =i+1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if((r-l+1) > resLength) {
                    res = s.substring(l,r+1);
                    resLength = r-l+1;
                }
                l--;
                r++;
            }
        }



        return res;
    }

}
