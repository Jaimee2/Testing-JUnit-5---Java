import java.util.ArrayList;
import java.util.List;

public class FizzBuss {
    public List<String> getNumbe() {
        List<String> listnumber = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            listnumber.add(devNumber(i));
        }
        return listnumber;
    }

    private String devNumber(int i) {
        if ((i % 5 == 0) && (i % 3 == 0)) {
            return "Fizz&Buss";
        } else if (i % 5 == 0) {
            return "Buss";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(i);
        }
    }
}
