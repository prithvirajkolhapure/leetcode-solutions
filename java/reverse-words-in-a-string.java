class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        s = s.trim();
        int j = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                result.append(s.substring(i + 1, j));
                result.append(" ");

                // skip multiple spaces
                while (i > 0 && s.charAt(i - 1) == ' ') {
                    i--;
                }
                j = i;
            }
        }
        // first word
        result.append(s.substring(0, j));

        return result.toString();
    }
}