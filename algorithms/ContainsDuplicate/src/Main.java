import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
        }
        return false;
    }
    }