import java.text.NumberFormat;
import java.util.Locale;

public class OddEven {

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static String formatIDR(int n) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatter.format(n);
    }
}