public class Cloud {

    public static int jumpingOnClouds(List<Integer> c) {
        int num_jump = 0;
        int i = 0;
        int[] A = new int[c.size()];
        int j = 0;
        for (Integer k : c) {
            A[j] = k;
            j++;
        }
        while(i<A.length-1){
            if (i + 2 == c.size() || A[i + 2] == 1) {
                num_jump++;
                i++;
            }
            else {
                i += 2;
                num_jump++;
            }
        }
        return num_jump;
    }

}
