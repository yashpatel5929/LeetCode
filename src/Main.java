import stack.DailyTemperature;
import stack.GenerateParenthesis;
import stack.ReversePolishNotation;
import stack.ValidParenthesis;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*ValidParenthesis validPara = new ValidParenthesis();
        System.out.println(""+validPara.isValid("()[}{}"));*/
       /* ReversePolishNotation revpolish = new ReversePolishNotation();
        System.out.println(""+revpolish.evalRPN(new String[]{"18"}));
*/
       /* GenerateParenthesis gen = new GenerateParenthesis();
        gen.generateParenthesis(3);*/

        DailyTemperature temp = new DailyTemperature();
        System.out.println(temp.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }


}

