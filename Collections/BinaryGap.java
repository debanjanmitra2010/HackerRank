public class BinaryGap {

    public static void main(String[] args) {
        int b = 1010110001;
        String s = String.valueOf(b);
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '1'){
                A.add(i);
            }
        }
        for(int i =0; i<A.size()-1;i++) {
            if (A.get(i + 1) - A.get(i) > 1) {
                Integer gap = (A.get(i + 1) - A.get(i)) - 1;
                System.out.println("Binary Gap from " + A.get(i) + " to " + A.get(i + 1) + " is :" + gap);
            }
        }
        System.out.println(A);
    }
}
