import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            int rand = (int) (Math.random() * 1000);
            nums.add(rand);
        }

        Collections.sort(nums);

        for (Integer num : nums) {
            System.out.println(nums.indexOf(num) + ":" + num);
        }

        int target = 346;
        int index = Collections.binarySearc(nums, target);

        if (index >= 0) {
            System.out.println("Искомый элемент " + target);
            System.out.println("Число найдено на позиции " + index);
            System.out.println("Элемент на позиции "+ index + ": " + nums.get(index));
        } else {
            System.out.println("Число не найдено");
        }

        }
    }