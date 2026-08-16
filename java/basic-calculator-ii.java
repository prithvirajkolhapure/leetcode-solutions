class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';

        for (int i = 0; i <= s.length(); i++) {
            // Add a dummy '+' at the end
            char ch = (i == s.length()) ? '+' : s.charAt(i);
            // Build multi-digit number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch != ' ') {
                // Process previous operator
                if (op == '+') 
                    stack.push(num);
                 else if (op == '-') 
                    stack.push(-num);
                 else if (op == '*') 
                    stack.push(stack.pop() * num);
                 else if (op == '/') 
                    stack.push(stack.pop() / num);
                
                // Current operator becomes previous operator
                op = ch;
                // Reset number
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}