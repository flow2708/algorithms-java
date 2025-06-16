import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,34,23,2,75,2,56};
        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    }
