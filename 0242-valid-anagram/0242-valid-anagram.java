class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int[127];
        for(int i=0;i<s.length();++i) freq[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();++i) freq[t.charAt(i)-'a']--;
        int cnt=0;
        for(int i=0;i<127;++i) if(freq[i]!=0) cnt++;
        
        return cnt==0;
    }
}