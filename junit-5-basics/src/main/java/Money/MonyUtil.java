package Money;

import java.text.DecimalFormat;

public class MonyUtil {
    public static String format(double money) {

        String simbolo = "$";
        if (money < 0) {
            simbolo = "-$";
            money = money * -1;
        }

        return simbolo + String.format("%.2f", money);
    }

    public static String format(double money, String simbolo) {
        if (simbolo == null){
            throw new NullPointerException();
        }
        if (money < 0) {
            simbolo = "-" + simbolo;
            money = money * -1;
        }
        return simbolo + String.format("%.2f", money);
    }
}
