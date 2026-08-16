// class Solution {
//     public int myAtoi(String s) {
//       s=s.trim();
//       int ans=1;
//       int result=0;
//       StringBuilder temp=new StringBuilder();

//        if(s.length() == 0)
//         return 0;
//        if(s.charAt(0)=='-')
//         ans=-1;
//         if(s.charAt(0)=='0'||s.charAt(1)=='0')
//         result=0;
//       for(int i=0;i<s.length();i++){
//        if(s.charAt(i)>='0'&&s.charAt(i)<='9')
//             temp.append(s.charAt(i));
//         else{ 
//         break;
//       }
//       } 
//       result=Integer.parseInt(temp.toString());
//       return result*ans; 
//     }
// }

class Solution {
  public int myAtoi(String s) {
    s = s.strip();
    if (s.isEmpty())
      return 0;

    final int sign = s.charAt(0) == '-' ? -1 : 1;
    if (s.charAt(0) == '+' || s.charAt(0) == '-')
      s = s.substring(1);

    long num = 0;

    for (final char c : s.toCharArray()) {
      if (!Character.isDigit(c))
        break;
      num = num * 10 + (c - '0');
      if (sign * num <= Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
      if (sign * num >= Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
    }

    return sign * (int) num;
  }
}