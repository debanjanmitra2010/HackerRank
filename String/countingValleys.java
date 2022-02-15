import java.util.ArrayList;

public class Valley {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int elevation = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') {
                elevation--;
            } else {
                if (elevation == -1) {
                    valleys++;
                }
                elevation++;
            }
        }
        System.out.println(valleys);
        return valleys;
    }


    public static void main(String[] args) {
         String s = "DDUUUUDD";
        Valley v = new Valley();
        // String s = "UDDDUDUU";
        v.countingValleys(s.length(), s);
    }
}



