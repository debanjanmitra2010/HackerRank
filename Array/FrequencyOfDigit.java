import java.util.*;

public class FrequencyOfDigit {

    public void method(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                int lastdigit = num % 10;
                list.add(lastdigit);
                num = num / 10;
            }
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer i : list) {
            if (frequency.containsKey(i)) {
                // When element exist
                // Increase the element frequency
                frequency.put(i, frequency.get(i) + 1);
            } else {
                // Add new record
                frequency.put(i, 1);
            }
        }
        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();

        //Use Comparator.reverseOrder() for reverse ordering
        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        System.out.println("Frequency of Digit: " + reverseSortedMap);
        int count = 0;
        for (Integer i : reverseSortedMap.keySet()) {
            if (count < k) {
                System.out.println(i);
            }
            count++;
        }
    }

    public static void main(String[] args) {
        FrequencyOfDigit d = new FrequencyOfDigit();
        int[] A = {527, 516, 216, 965, 951};
        d.method(A, 2);
    }

}
