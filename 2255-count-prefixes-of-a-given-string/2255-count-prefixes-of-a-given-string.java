class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(String i:words){
            if(s.startsWith(i)) ++cnt;
        }
        return cnt;
    }
}