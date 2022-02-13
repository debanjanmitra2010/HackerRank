import java.util.*;
import java.util.stream.Collectors;

public class Frequency {
    public void kthFrequent(int[] arr, int k) {
        if (k < 1 || arr.length < 1) {
            // Invalid inputs
            return;
        }
        // Use to collect element frequency
        HashMap<Integer, Integer> record = new HashMap<>();
        // Use to combine elements by frequency
        HashMap<Integer, ArrayList<Integer>> result = new HashMap<>();
        // Find the frequency of array element
        for (int i = 0; i < arr.length; ++i) {
            if (record.containsKey(arr[i])) {
                // When element exist
                // Increase the element frequency
                record.put(arr[i], record.get(arr[i]) + 1);
            } else {
                // Add new record
                record.put(arr[i], 1);
            }
        }
        // Combine elements by frequency
        for (int key : record.keySet()) {
            if (result.containsKey(record.get(key)) == false) {
                result.put(record.get(key), new ArrayList<Integer>());
            }
            result.get(record.get(key)).add(key);
        }
        System.out.print("\n Initial " + k + " Frequent Element is \n");
        // Use to collect key
        int[] keyRecord = new int[result.size()];
        int count = 0;
        // Get key in array
        for (int key : result.keySet()) {
            keyRecord[count] = key;
            count++;
        }
        count = 0;
        // iterates the loop through by key Record in reverse order
        for (int j = result.size() - 1; j >= 0; j--) {
            // Get resultant node
            ArrayList<Integer> ans = result.get(keyRecord[j]);
            // Display calculate element
            for (int data : ans) {
                System.out.print("  " + data);
                count++;
                if (count >= k) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Frequency task = new Frequency();
        int[] arr = {5, 8, 9, 7, 9, 2, 9, 8, 5, 9, 5, 8};
        int k = 3;
        task.kthFrequent(arr, k);
    }
}
