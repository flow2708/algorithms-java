import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] myArray1 = {5,54,5,1,4,6};
        int[] myArray2 = {2,256,46,7,3,4,8,9};
        System.out.println(new Main().combine(myArray1, myArray2));
        }
        public List<Integer> combine(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
        }
    }
