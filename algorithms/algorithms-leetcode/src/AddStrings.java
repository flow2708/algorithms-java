import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {

    }
    public String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger ans = a.add(b);
        String s = String.valueOf(ans);
        return s;
    }
}
