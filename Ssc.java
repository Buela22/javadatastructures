import java.util.HashMap;
import java.util.Map;

public class Ssc {

    public static void main(String[] args) {
        int[] a = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int Ssc = css(a);
        System.out.println("Count of singular socks = " + Ssc);
    }

    public static int css(int[] a) {
        Map<Integer, Integer> sockCounts = new HashMap<>();
        for (int sock : a) {
            sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
        }
        int Ssc = 0;
        for (int count : sockCounts.values()) {
            if (count % 2 != 0) {
                Ssc++;
            }
        }
        return Ssc;
    }
}