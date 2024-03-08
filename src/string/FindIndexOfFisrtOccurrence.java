package string;

public class FindIndexOfFisrtOccurrence {
    public static void main(String[] args) {
        FindIndexOfFisrtOccurrence findIndexOfFisrtOccurrence = new FindIndexOfFisrtOccurrence();
       int n =  findIndexOfFisrtOccurrence.strStr("leetcode","leeto");
       System.out.println(""+n);
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
