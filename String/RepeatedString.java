import java.util.ArrayList;

public class RepeatedString {

    public static int count = 0;

    public static long method(String s, long n) {
        // Write your code here
        long remaining = n % s.length();
        long divisible = n / s.length();
        long totalA = 0;
        long totalB = 0;
        long total = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                totalA++;
            }
        }
        if (remaining == 0) {
            totalA = totalA * divisible;
        } else {
            for (int i = 0; i < remaining; i++) {
                if (s.charAt(i) == 'a') {
                    totalB++;
                }
            }
        }
        total = totalA * divisible + totalB;
        return total;

        //        ArrayList<Character> A = new ArrayList<>();
//        while (A.size() <= (n - 1)) {
//            for (int j = 0; j < s.length(); j++) {
//                System.out.println(A.size());
//                if (A.size() <= (n - 1)) {
//                    A.add(s.charAt(j));
//                }
//            }
//        }
//        for (Character c : A) {
//            if (c == 'a') {
//                count++;
//            }
//
//        }

    }

    public static void main(String[] args) {
        method("aba", 10);
    }


}
