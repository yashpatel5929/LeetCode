package string;

import stack.ReversePolishNotation;

public class ReverseWordInString {

    public static void main(String[] args) {
        ReverseWordInString sd = new ReverseWordInString();
        System.out.println("" + sd.reverseWords("the sky is blue"));
    }

    public String reverseWords(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//
//        String temp = "";
//        String ans = "";
//
//        while (left <= right) {
//            char ch = s.charAt(left);
//            if (ch != ' ') {
//                temp += ch;
//            } else if (ch == ' ') {
//                if (!ans.equals("")) ans = temp + " " + ans;
//                else ans = temp.trim();
//                temp = "";
//            }
//            left++;
//
//        }
//
//        if(!temp.equals("")) {
//            if (!ans.equals("")) ans = temp + "" + ans;
//            else ans = temp.trim();
//        }
//
//        return ans.trim();

            StringBuilder ans=new StringBuilder();

            String temp = "";
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch==' ')
                {
                    //if we find white space add temp in the start
                    if(!temp.equals(""))
                    {
                        //adding in the front every time
                        ans.insert(0,temp+" ");
                    }

                    temp = "";
                }
                else
                    temp += ch;
            }
        if(!temp.equals(""))
        {
            //adding in the front every time
            ans.insert(0,temp+" ");
        }

            //just removing the extra space at the end of the ans
            return ans.toString().substring(0,ans.length()-1);


    }
}



