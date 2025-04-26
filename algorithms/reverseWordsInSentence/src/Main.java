public class Main {
    public static void main(String[] args) {

        }
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            res.append(reversedWord).append(" ");
        }
        return res.toString().trim();
    }
    }