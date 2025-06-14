public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().factorial(5));
        }
    public int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
}