import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(2);
        al.add(6);
        al.add(7);
        al.add(3);

        System.out.println(new Main().selectionSort(al));
        }
    public int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestInd = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestInd = i;
            }
        }

        return smallestInd;
    }
    public List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> copy = new ArrayList<>(arr);

        while (!copy.isEmpty()) {
            int smallestInd = findSmallest(copy);
            sorted.add(copy.get(smallestInd));
            copy.remove(smallestInd);
        }
        return sorted;
    }
}