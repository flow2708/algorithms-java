import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(23);
        list.add(15);
        list.add(28);
        list.add(18);

        System.out.println(new Main().findMajorNum(list));
        }
    public int findMajorNum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int majorNum = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > majorNum) {
                majorNum = list.get(i);
            }
        }
        return majorNum;
    }
}
