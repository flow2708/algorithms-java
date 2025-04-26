public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8};
        System.out.println(new Main().searchInsert(arr, 4));
        }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
    }
