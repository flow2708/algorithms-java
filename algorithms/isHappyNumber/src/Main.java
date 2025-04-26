import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getTotalSum(n);
        }

        return n == 1;
    }

    public int getTotalSum(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }
    }
