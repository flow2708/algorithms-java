import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        }
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }


            map.put(nums[i], i);
        }

        // Если пара не найдена (хотя по условию задачи это не должно произойти)
        throw new IllegalArgumentException("Нет решения");
    }
    }