class Solution {
    public boolean backspaceCompare(String s, String t) {
       return build(s).equals(build(t));
    }
    public String build (String str){
        Stack<Character>stack = new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(!stack.empty())  
                     stack.pop();
            }
            else
                stack.push(ch);
        }

        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty())
            result.append(stack.pop());
        // for(char c:stack)
        //     result.append(c);
        
        return result.toString();

        
    }

}