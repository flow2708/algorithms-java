public class Main {
    public static void main(String[] args) {

        }
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    }
