import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
    }
