import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();

        for (int num : nums1) {
            firstSet.add(num);
        }

        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : nums2) {
            if (firstSet.contains(num)) {
                uniqueSet.add(num);
            }
        }
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i] = num;
            i++;
        }
        return result;
    }
    }
