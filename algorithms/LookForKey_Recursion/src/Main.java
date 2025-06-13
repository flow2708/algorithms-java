import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Key key = new Key("box");
        Box box1 = new Box(key);
        Box box2 = new Box(box1);
        Box box3 = new Box(box2);
        Box box4 = new Box(box3);
        Box mainBox = new Box(box4);

        new Main().lookForKey(mainBox);
        }
    public void lookForKey(Box box) {
        List<Box> boxes = new ArrayList<>();

        boxes.add(box);

        while (!boxes.isEmpty()) {
            Box currentBox = boxes.remove(0);
            Object item = currentBox.getItem();

            if (item instanceof Key) {
                System.out.println("Ключ найден!");
                return;
            } else if (item instanceof Box) {
                System.out.println("В этой коробке ключ не найден, смотрим следующую");
                boxes.add((Box) item);
            }
        }
        System.out.println("Ключ не найден!");
    }
}