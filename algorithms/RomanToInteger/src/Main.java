import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().romanToInt("VXLC")); //for example

    }

    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int currentNum = romanToIntMap.get(s.charAt(i));
            // Проверяем, есть ли следующий символ
            if (i + 1 < s.length()) {
                int nextNum = romanToIntMap.get(s.charAt(i + 1));

                // Если текущее число меньше следующего, вычитаем его
                if (currentNum < nextNum) {
                    result -= currentNum;
                } else {
                    result += currentNum;
                }
            } else {
                // Если это последний символ, просто добавляем его
                result += currentNum;
            }
        }

        return result;
    }
}