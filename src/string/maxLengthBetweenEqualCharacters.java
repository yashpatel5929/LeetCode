package string;

public class maxLengthBetweenEqualCharacters {

    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters ma= new maxLengthBetweenEqualCharacters();
        int res = ma.maxLengthBetweenEqualCharacters("cbzxy");
        System.out.println(""+res);
    }
    public int maxLengthBetweenEqualCharacters(String s) {
        int max= -1;
        for(int i = 0 ; i < s.length() ; i++) {
            for(int j=s.length()-1 ; j > 0 ; j--) {
                if(s.charAt(i) == s.charAt(j) && i < j) {
                    String res = s.substring(i+1,j);
                    if(max < res.length()){
                        max = res.length();
                    }
                }
            }
        }

        return max;
    }
}
