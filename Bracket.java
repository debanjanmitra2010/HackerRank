import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Bracket {

    public boolean IsBalanced(String str) {
        String str1 = str.replace(" ", "");
        Deque<Character> deque = new ArrayDeque<>();
        char[] c = str1.toCharArray();
        System.out.println(Arrays.toString(c));
        for (char ch : c) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty() && ch == '}' || ch == ']' || ch == ')') {
                    if (((deque.peekFirst() == '{' && ch == '}')
                            || (deque.peekFirst() == '[' && ch == ']')
                            || (deque.peekFirst() == '(' && ch == ')'))) {
                        deque.removeFirst();
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Bracket b = new Bracket();
        System.out.println(b.IsBalanced("[(Hello) (World)]"));
    }


}
