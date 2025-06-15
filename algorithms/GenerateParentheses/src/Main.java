import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().generateParentis(3));
        }
    public List<String> generateParentis(int n) {
        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    public void recurse(List<String> res, int right, int left, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            recurse(res, right, left + 1, s + "(", n);
        }
        if (right < left) {
            recurse(res, right + 1, left, s + ")", n);
        }
    }
}
