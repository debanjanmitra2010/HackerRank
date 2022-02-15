public class permutation {

    public void printPermutation(Integer[] arr, int currentIndex) {

        if (currentIndex == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }


        for (int i = currentIndex; i < arr.length; i++) {
            swap(arr, i, currentIndex);
            printPermutation(arr, currentIndex + 1);
            swap(arr, i, currentIndex);
        }
    }


    public void swap(Integer[] arr, int i, int currentIndex) {
        int temp = arr[i];
        arr[i] = arr[currentIndex];
        arr[currentIndex] = temp;
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        permutation p = new permutation();
        p.printPermutation(arr, 0);
    }
}
