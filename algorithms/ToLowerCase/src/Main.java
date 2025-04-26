public class Main {
    public static void main(String[] args) {

        }
    public String toLowerCase(String s) {
        //return s.toLowerCase(); НУЖНО ДЕЛАТЬ ТАК!
        //ВНИЗУ УСЛОЖНЕННОЕ РЕШЕНИЕ! ТАК ДЕЛАТЬ КАТЕГОРИЧЕСКИ НЕЛЬЗЯ ЕСЛИ НАМ НУЖНО ПРОСТО ПЕРЕВЕСТИ ТЕКСТ В НИЖНИЙ РЕГИСТР
        int left = 0;
        StringBuilder word = new StringBuilder("");

        while (left < s.length()) {
            word.append(Character.toLowerCase(s.charAt(left)));
            left++;
        }
        return String.valueOf(word);
    }
    }