import java.util.*;

class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        // Outside all brackets, sign effect is positive
        stack.push(1);

        int ans = 0;
        int num = 0;
        int sign = 1;

        for (char ch : s.toCharArray()) {

            // Build number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // Add previous number
            else if (ch == '+') {
                ans += sign * num;
                num = 0;

                sign = stack.peek();
            }

            // Subtract previous number
            else if (ch == '-') {
                ans += sign * num;
                num = 0;

                sign = -stack.peek();
            }

            // Enter parentheses
            else if (ch == '(') {
                stack.push(sign);
            }

            // Leave parentheses
            else if (ch == ')') {
                stack.pop();
            }
        }

        // Last number
        ans += sign * num;

        return ans;
    }
}