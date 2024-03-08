package string;

public class CountAndSay {

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        countAndSay.countAndSay(4);
    }
    public String countAndSay(int n) {
        String s = "1";
        for(int i =1 ; i < n ; i++) {
           s=  giveCont(s);
        }
        System.out.println(""+s);
        return s;
    }

    String giveCont(String s) {
        StringBuilder ans = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1 ; i < s.length() ; i++) {
            if(s.charAt(i) == c){
                count++;
            }else {
                ans.append(count);
                ans.append(c);
                c = s.charAt(i);
                count =1 ;
            }
        }
        ans.append(count);
        ans.append(c);
        return ans.toString();


    }
}
