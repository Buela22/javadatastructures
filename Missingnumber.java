import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missingnumber {
    public static void main(String[] args) {
      
        int[] arr = {1, 2, 3, 5, 6, 8, 10, 11, 14};
        System.out.println("Missing numbers in arrNum2: " + findMissingNumbers(arr));
    }

    public static String findMissingNumbers(int[] arr) {
        Arrays.sort(arr);

        List<Integer> missingNumbers = new ArrayList<>();
        int min = arr[0];
        int max = arr[arr.length - 1];

        for (int i = min + 1; i < max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(i);
            }
        }

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < missingNumbers.size(); i++) {
            a.append(missingNumbers.get(i));
            if (i < missingNumbers.size() - 1) {
                a.append(", ");
            }
        }

        return a.toString();
    }
}