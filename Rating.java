public class Rating {
    int rating = 1500;
    List<Integer> A = new ArrayList<>();

    public int[] method(int[] arr) {
    int[] c = new int[2];
        for (int i = 0; i < arr.length; i++) {
            rating = rating + arr[i];
            A.add(rating);
        }
        c[0] = Collections.max(A);
        c[1] = rating;
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {100, -200, 350, 200, -400, -300, 100};
        Rating r = new Rating();
        r.method(arr);
    }
}
