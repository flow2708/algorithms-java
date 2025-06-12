import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,7,1,4,8,4,2,10,5};

        Arrays.sort(arr);

        System.out.println(new Main().binarySearch(arr, 8));
        }
        int binarySearch(int[] array, int target) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = low + high;
                int midNum = array[mid];

                if (midNum == target) {
                    return mid;
                }
                if (midNum > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }
