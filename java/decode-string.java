class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push everything until we find ']'
            if (ch != ']') 
                stack.push(ch);
             
            else {

                // Step 1: Get string inside [...]
                StringBuilder temp = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '[') 
                    temp.append(stack.pop());
               
                // Because stack gives characters in reverse order
                temp.reverse();

                // Step 2: Remove '['
                stack.pop();

                // Step 3: Get the number before '['
                StringBuilder num = new StringBuilder();

                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num.insert(0,stack.pop());
                }
                int repeat=Integer.parseInt(num.toString());
                StringBuilder repeated=new StringBuilder();

                for(int i=0;i<repeat;i++)
                    repeated.append(temp);
                // Step 5: Push repeated string back character by character
                for (char c : repeated.toString().toCharArray()) {
                    stack.push(c);
                }
            }
        }
        // Build final answer
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}