class Solution {
    public boolean validPalindrome(String s) {
         int left = 0, right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right))
            return isbool(s, left+1, right) || isbool(s, left, right-1);
        left++;
        right--;
    }
    return true;
}

public boolean isbool(String s1, int l, int r) {
    while (l < r) {
        if (s1.charAt(l) != s1.charAt(r))
            return false;
        l++;
        r--;
    }
    return true;
}
}
/*
 for (int l = 0, r = s.length() - 1; l < r; ++l, --r)
      if (s.charAt(l) != s.charAt(r))
        return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
    return true;
  }

  private boolean validPalindrome(final String s, int l, int r) {
    while (l < r)
      if (s.charAt(l++) != s.charAt(r--))
        return false;
    return true;
    */