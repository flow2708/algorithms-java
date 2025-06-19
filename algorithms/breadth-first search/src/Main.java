import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().graph());
        }
    public boolean graph() {
        Hashtable<String, String[]> table = new Hashtable<>();
        String[] you = {"john","michael","alice","jennifer","james"};

        table.put("you", you);

        ArrayDeque<String> queue = new ArrayDeque();
        //queue.add(Arrays.toString(you));
        for (String s : table.get("you")) {
            queue.add(s);
        }
        String person = queue.pop();

        while (!queue.isEmpty()) {
            if (new Main().isMangoSeller(person)) {
                return true;
            } else {
                person = queue.pop();
            }
        }
        return false;
    }
    public boolean isMangoSeller(String name) {
        if (name == "alice") {
            return true;
        } else {
            return false;
        }
    }
}