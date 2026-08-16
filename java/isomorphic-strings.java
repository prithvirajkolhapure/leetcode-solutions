class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> ss=new HashMap<>();
        Map<Character,Integer> tt=new HashMap<>();
        for(Integer i=0;i<s.length();i++){
            if(ss.put(s.charAt(i),i)!= tt.put(t.charAt(i),i))
            return false;
        }
        return true;
    }
}