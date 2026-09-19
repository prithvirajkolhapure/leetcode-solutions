1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length())
4        return false;
5        int count[]=new int[26];
6        for(char c:s.toCharArray())
7            ++count[c-'a'];
8        for(char c:t.toCharArray()){
9            if(count[c-'a']==0)
10                 return false;
11            --count[c-'a'];
12        }
13        return true;
14    }
15}