public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();


        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(new Main().checkForTarget(myArray, 19));
        //======Вычисление времени выполнения кода======
        long endTime = System.nanoTime();
        long durationInMicroseconds = (endTime - startTime) / 1000;
        System.out.println(durationInMicroseconds);
        //==============================================
    }
    public boolean checkForTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int curr = nums[left] + nums[right];
            if (curr == target) {
                return true;
            }

            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}