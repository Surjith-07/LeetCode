class Solution {
    public int isPrefixOfWord(String sen, String search) {
        String s[]=sen.split(" ");
        int idx=-1;
        for(int i=0;i<s.length;++i){
            if(s[i].startsWith(search)) return i+1; 
        }
        return idx;
    }
}