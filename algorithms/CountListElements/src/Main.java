import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> arr = Arrays.asList("5",4,2,"7",8,5);

        System.out.println(new Main().countElements(arr));
        }
    public int countElements(List<Object> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return 1 + countElements(list.subList(1, list.size()));
        }
    }
}