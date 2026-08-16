class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);

        Stack<Integer> stack=new Stack<>();
        
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n]; //because we calculate for 2n so there is no such 2n number so index modulo is done
           
            while(!stack.isEmpty()&&stack.peek()<=num)
                stack.pop();
            
            if(!stack.isEmpty()&&i<n)
                ans[i]=stack.peek();
            
            stack.push(num);
        }     
        return ans;
    }
}
