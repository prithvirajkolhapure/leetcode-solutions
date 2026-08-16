class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        Set<Integer> remove=new HashSet<>(); //invalid '()' index store so not to add to sb

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                else{
                    remove.add(i);
                }
            }
        }
        while(!st.isEmpty())
        {
            remove.add(st.pop());
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!remove.contains(i))
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}