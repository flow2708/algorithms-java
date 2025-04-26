public class Main {
    public static void main(String[] args) {
        String palindrome = "ab c cb a";
        System.out.println(new Main().isPalindrome(palindrome));
        }
        public boolean isPalindrome(String s) {
        StringBuilder letters = new StringBuilder("");
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                letters.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int right = letters.length() - 1;

        while (left < right) {
            if(letters.charAt(left) != letters.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
        }
    }
