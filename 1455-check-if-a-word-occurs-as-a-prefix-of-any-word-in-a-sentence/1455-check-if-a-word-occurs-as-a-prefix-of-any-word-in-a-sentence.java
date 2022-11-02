class Solution {
    public int isPrefixOfWord(String sen, String sea) {
        String ss[]=sen.split(" ");
        for(int i=0;i<ss.length;++i){
            if(ss[i].startsWith(sea)) return i+1;
        }
        return -1;
    }
}