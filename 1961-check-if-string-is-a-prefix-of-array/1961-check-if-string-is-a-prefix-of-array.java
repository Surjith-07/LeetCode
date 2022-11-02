class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String ans="";
        for(String ss:words){
            if(s.indexOf(ss)!=-1){
                ans+=ss;
            }
            if(ans.equals(s)) return true;
            if(s.indexOf(ss)==-1) return false;
        }
        return false;
    }
}