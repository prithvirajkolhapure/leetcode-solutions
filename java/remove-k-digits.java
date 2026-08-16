class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();

        for(char ch:num.toCharArray()){

            while(k>0 && sb.length()>0 && ch<sb.charAt(sb.length()-1)){ 
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(ch);
        }

        while(k>0){ //for ascending numbers 
            sb.deleteCharAt(sb.length()-1);
                k--;
        }

        int zeros=0;//index which checks zeros
        while(zeros<sb.length() && sb.charAt(zeros)=='0'){ //00123
            zeros++;
        }
        String ans=sb.substring(zeros); 

        return ans.isEmpty() ? "0" : ans;
    }
}



// class Solution {
//     public String removeKdigits(String num, int k) {
//         // Use StringBuilder as a stack to build the result
//         StringBuilder stack = new StringBuilder();
      
//         // Iterate through each digit in the input number
//         for (char currentDigit : num.toCharArray()) {
//             // Remove larger digits from the stack when a smaller digit is found
//             // This ensures we get the smallest possible number
//             while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > currentDigit) {
//                 stack.deleteCharAt(stack.length() - 1);
//                 k--;
//             }
//             // Add the current digit to the stack
//             stack.append(currentDigit);
//         }
      
//         // If there are still digits to remove, remove them from the end
//         // This handles cases where the number is already in ascending order
//         while (k > 0) {
//             stack.deleteCharAt(stack.length() - 1);
//             k--;
//         }
      
//         // Remove leading zeros from the result
//         int leadingZeroIndex = 0;
//         while (leadingZeroIndex < stack.length() && stack.charAt(leadingZeroIndex) == '0') {
//             leadingZeroIndex++;
//         }
      
//         // Extract the final result without leading zeros
//         String result = stack.substring(leadingZeroIndex);
      
//         // Return "0" if the result is empty, otherwise return the result
//         return result.isEmpty() ? "0" : result;
//     }
// }