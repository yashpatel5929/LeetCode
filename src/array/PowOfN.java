package array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PowOfN {

    public static void main(String[] args) {
        PowOfN pN = new PowOfN();
        Double ans = pN.myPow( 2.00000,10);
        System.out.println( ""+ans);
    }

    public double myPow(double x, int n) {
        Double ans = 1.0;
        long nn = n;
        if(n < 0) nn = -1 * nn;
        while (nn > 0) {
            if(nn % 2 == 1) {
                ans = ans * x;
                nn = nn -1;
            }else {
                x = x*x;
                nn = nn /2;
            }
        }
        if(n < 0) ans = (double) (1.0) / (double) ans;
        return ans;
    }
}
