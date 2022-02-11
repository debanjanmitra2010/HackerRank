import java.util.*;

public class Socks {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> socks = new HashMap<>();
        int pairs = 0;
        for (Integer i : ar) {
            if (socks.containsKey(i)) {
                // When element exist
                // Increase the element frequency
                socks.put(i, socks.get(i) + 1);
            } else {
                // Add new record
                socks.put(i, 1);
            }
        }
        for (Integer key : socks.keySet()) {
            Integer valueofKey = socks.get(key);
            if (valueofKey % 2 != 0 && valueofKey > 1) {
                pairs = pairs + ((valueofKey - 1) / 2);
            } else if(valueofKey > 1) {
                pairs = pairs + (valueofKey / 2);
            }
        }
        return pairs;
    }
        public static void main (String[]args){
            List<Integer> arr = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
            sockMerchant(7, arr);
        }
}
