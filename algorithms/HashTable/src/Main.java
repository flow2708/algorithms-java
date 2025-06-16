import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите действие: ");
            System.out.println("1.Поиск продукта по названию\n2.Проверка избирателя по имени\n3.Выход");
            String action = scanner.nextLine();

            switch (action) {
                case "1":
                    System.out.println("Введите название ");
                    String productName = scanner.nextLine();
                    try {
                        System.out.println("Цена " + productName + " " + new Main().getProduct(productName));
                    } catch (NullPointerException e) {
                        System.out.println("Ничего не найдено");
                    }
                case "2":
                    System.out.println("Введите имя избирателя ");
                    try {
                        String voterName = scanner.nextLine();
                        new Main().checkVoter(voterName);
                    } catch (NullPointerException e) {
                        System.out.println("Ничего не найдено");
                    }
            }
        }
    }
    public double getProduct(String name) {
        Hashtable<String, Double> products = new Hashtable<String, Double>();
        products.put("milk", 1.54);
        products.put("apple", 0.2);
        products.put("cola", 2.0);

        return products.get(name);
    }
    public void checkVoter(String name) {
        Hashtable<String, Boolean> voters = new Hashtable<>();
        voters.put("Джон", false);
        voters.put("Джордж", false);
        voters.put("Майкл", true);

        if(voters.get(name)) {
            System.out.println("Этот избиратель уже голосовал!");
        }
        if (voters.get(name) == false) {
            System.out.println("Этот избиратель ещё не голосовал!");
        }
    }
}
