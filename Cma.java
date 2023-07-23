import java.util.Arrays;

public class Cma {
    public static void main(String[] args) {
        int[] x = {5, 3, 4, 2, 0, 8};
        ccm(x);
        System.out.println("x = " + Arrays.toString(x));
    }

    public static void ccm(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            try {
                if (arr[i] != 0) {
                    arr[i] = arr[i - 1] * arr[i];
                } else {

                    for (int j = i; j < arr.length; j++) {
                        arr[j] = 0;
                    }
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException ie) {
                System.out.println("Array index out of bounds exception occurred!");
                
            }
        }
    }
}