public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().findTheUnique("hello","oellohx"));
        }
        public char findTheUnique(String s, String t) {
        char res = 0;
        for(char ch : s.toCharArray()) {
            res ^= ch;
        }
        for (char ch : t.toCharArray()) {
            res ^= ch;
        }
        return res;
        }
    }
