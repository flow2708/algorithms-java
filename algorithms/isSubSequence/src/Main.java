public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().isSubSequence("sde", "superduper"));
        }
        //Проверяте переменную s на подпоследовательность для переменной t
        public boolean isSubSequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
        }
    }