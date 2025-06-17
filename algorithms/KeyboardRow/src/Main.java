import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        }
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new LinkedList<>();

        for (String word : words) {
            if (isContain(word, row1) || isContain(word, row2) || isContain(word, row3)) {
                result.add(word);
            }
        }

        String[] output = result.toArray(new String[0]);
        return output;
    }
    public boolean isContain(String str, String row) {
        for (char c : str.toLowerCase().toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
    }