class Solution {
    public int scoreOfParentheses(String s) {
        int curr=0;
        Stack<Integer>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(curr);
                curr=0;
            }
            else
                curr=stack.pop()+ Math.max(2*curr,1); 
            
        }
        return curr;
    }
}