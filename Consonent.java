public class Consonent {
    public String method(String s) {
        String STR = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                str.append(c);
            } else {
                char d = (char) (c + 1);
                str.append(d);
            }
        }
        STR = STR + str.toString();
        System.out.println(STR);
        return STR;
    }

    public static void main(String[] args) {
        CodeTest2 t = new CodeTest2();
        t.method("CodeSignal");
    }
}
