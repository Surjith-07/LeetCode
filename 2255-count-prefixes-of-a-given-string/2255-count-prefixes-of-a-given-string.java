class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(String ss:words){
            if(s.startsWith(ss)) cnt++;
        }
        return cnt;
    }
}