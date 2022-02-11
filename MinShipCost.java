public class MinShipCost {

    public int minimumcost(int[] arr, int k) {
        ArrayList<Integer> A = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(A.toString());
        int occupied = arr.length;
        int spaceToFill = k - occupied;
        int count = 0;
        int sum = 0;
        ArrayList<Integer> B = new ArrayList<>();
        Arrays.sort(arr);
        int LastNumber = arr[arr.length - 1];
        for (int i = 1; i < LastNumber; i++) {
            if (!A.contains(i) && count<spaceToFill) {
                B.add(i);
                sum = sum +i;
                count++;
            }
        }
        System.out.println(B);
        return sum;
    }


    public static void main(String[] args) {
        int[] parcel = {2, 3, 6, 11, 10};
        MinShipCost A = new MinShipCost();
        System.out.println(A.minimumcost(parcel,9));

    }
}
