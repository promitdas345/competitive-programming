import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

class Solution {
    private static final Map<Character, Character> PAIRS =
            Map.of(')', '(', ']', '[', '}', '{');

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (PAIRS.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != PAIRS.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
