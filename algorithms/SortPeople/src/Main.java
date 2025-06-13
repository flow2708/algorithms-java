import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        }
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            names[index] = map.get(heights[i]);
            index++;
        }
        return names;
    }

    }