package string;

public class RepeatStringMatch {
    public static void main(String[] args) {
        RepeatStringMatch repeatStringMatch = new RepeatStringMatch();
        int res = repeatStringMatch.repeatedStringMatch("abcd","cdabcdab");
        System.out.println(""+res);
    }

    public int repeatedStringMatch(String a, String b){
        int i =0;
        StringBuilder ans = new StringBuilder();
        for(i =1 ; ans.length() <= b.length() ; i++) {
            ans.append(a);
            if(ans.toString().contains(b)) return i;
        }
        if(ans.append(a).toString().contains(b)) return i;
        return -1;
    }
   /* public int repeatedStringMatch(String a, String b) {
        int d = 256;
        int q = 101;
        int hash = 1;
        int textLen = a.length();
        int patLen = b.length();
        int patternHash = 0;
        int textHash = 0;
        int count = -1;

        for(int i =0 ; i < patLen ; i++){
            hash = (hash * d) % q;
        }

        for(int i = 0 ; i < patLen ; i++) {
            patternHash = (d * patternHash + b.charAt(i)) %q;
            textHash = (d * textHash + a.charAt(i)) %q;
        }

        for(int i =0 ; i < textLen - patLen ; i++) {
            if(patternHash == textHash) {
                for(int j =0 ; j < patLen ; j++) {
                    if(a.charAt(i+j) != b.charAt(j))
                        break;
                }
                count++;
            }


            if(i < textLen-patLen) {
                textHash = (d * (textHash-b.charAt(i)*hash) + b.charAt(i+patLen))%q;
            }

            if(textHash < 0)
                textHash = textHash+q;

        }

        return count;


        *//*if(b.isEmpty())
            return 0;
        if(a.contains(b)) {
            return 1;
        }else {

        }


        int i = 1;
        int result = -1;
        String dummy = a;
        while (i > 0 && i < b.length()) {
            dummy += a;
            if(dummy.contains(b)) {
                result = dummy.length()/a.length();
                i = 0;
                break;
            }
            i++;
        }
        return result;*//*
    }*/
}
