import java.util.Arrays;

public class Search {

    //O(logN) Time

    public void findNum(int[] arr, int n) {
        int length = arr.length / 2;
        if (n < arr[length]) {
            for (int i = 0; i < length; i++) {
                if (n == arr[i]) {
                    System.out.println(n + " Found at Index " + i);
                } else {
                    System.out.println("Item Not Found in Array");
                }
            }
        } else {
            for (int i = length; i < arr.length; i++) {
                if (n == arr[i]) {
                    System.out.println(n + " Found at Index " + i);
                } else {
                    System.out.println("Item Not Found in Array");
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 10, 8, 7, 28, 20, 30, 25};
        Arrays.sort(arr);
        Search s = new Search();
        System.out.println(Arrays.toString(arr));
        s.findNum(arr, 8);
        s.findNum(arr, 10);
        s.findNum(arr, 20);
        s.findNum(arr, 4);
    }
}
