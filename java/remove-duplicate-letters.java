class Solution {
    public String removeDuplicateLetters(String s) {

        int[] count = new int[26];
        boolean[] used = new boolean[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Current occurrence is now being processed
            count[ch - 'a']--;

            // Already present in answer
            if (used[ch - 'a']) {
                continue;
            }

            // Remove bigger characters if they appear again later
            while (sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) > ch &&
                   count[sb.charAt(sb.length() - 1) - 'a'] > 0) {

                char removed = sb.charAt(sb.length() - 1);

                used[removed - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            // Add current character
            sb.append(ch);
            used[ch - 'a'] = true;
        }

        return sb.toString();
    }
}