public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,3,8,1,3};
        System.out.println(new Main().sum(arr));
        }
    public int sum(int[] arr) {
        int total = 0;
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        for (int d : arr) {
            total += d;
        }
        return total;
    }
}
