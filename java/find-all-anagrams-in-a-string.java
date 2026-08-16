class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] freq = new int[26];

        // Frequency of characters in p
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Character is needed
            if (freq[ch - 'a'] > 0) {
                count++;
            }

            freq[ch - 'a']--;

            // Window becomes too large
            if (right - left + 1 > p.length()) {

                char remove = s.charAt(left);

                freq[remove - 'a']++;

                // This removed character was needed
                if (freq[remove - 'a'] > 0) {
                    count--;
                }

                left++;
            }

            // All characters matched
            if (count == p.length()) {
                ans.add(left);
            }
        }

        return ans;
    }
}