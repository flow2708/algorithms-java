import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFibonacciNumber(25));
        }
        public static ArrayList<Integer> findFibonacciNumber(int length) {
            ArrayList<Integer> fibonacciNum = new ArrayList<>();
        if (length <= 0) {
            return fibonacciNum;
        }
            fibonacciNum.add(0);
        if (length == 1) {
            return fibonacciNum;
        }
            fibonacciNum.add(1);

        for(int i = 2; i < length; i++) {
            fibonacciNum.add(fibonacciNum.get(i-1) + fibonacciNum.get(i-2));
        }
        return fibonacciNum;
        }
    }
