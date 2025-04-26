public class Main {
    public static void main(String[] args) {

        }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Начинаем с первого слова в массиве
        String prefix = strs[0];

        // Сравниваем префикс с каждой строкой
        for (int i = 1; i < strs.length; i++) {
            // Уменьшаем префикс, пока он совпадает с началом строки
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // Если префикс стал пустым, выходим из цикла
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    }