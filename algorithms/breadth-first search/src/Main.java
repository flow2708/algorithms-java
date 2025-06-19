import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().graph());
        }
    public boolean graph() {
        Hashtable<String, String[]> table = new Hashtable<>();
        String[] you = {"john","michael","alice","jennifer","james"};
        String[] michael = {"steve", "robert"};
        String[] jennifer = {"walter", "kate", "emma"};

        table.put("you", you);
        table.put("michael", michael);
        table.put("jennifer", jennifer);

        ArrayDeque<String> queue = new ArrayDeque();
        /*for (String s : table.get("you")) {
            queue.add(s);
        }
         */
        new Main().addToQueue(queue, table, "you");

        while (!queue.isEmpty()) {
            String person = queue.pop();
            if (new Main().isMangoSeller(person)) {
                return true;
            }
            if (table.get(person) != null) {
                new Main().addToQueue(queue, table, person);
            }
        }
        return false;
    }
    public void addToQueue(Queue<String> queue, Hashtable<String, String[]> table, String key) {
        for (String s : table.get(key)) {
            queue.add(s);
        }
    }
    public boolean isMangoSeller(String name) {
        if (name.equals("kate")) {
            return true;
        } else {
            return false;
        }
    }
}