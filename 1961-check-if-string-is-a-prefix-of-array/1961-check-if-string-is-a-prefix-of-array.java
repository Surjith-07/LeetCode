class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String ans="";
        for(String ss:words){
            if(s.indexOf(ss)!=-1){
                ans+=ss;
            }
            else if(ans.equals(s)) return true;
            else if(s.indexOf(ss)==-1) return false;
        }
        return s.length()<=ans.length() && s.equals(ans.substring(0,s.length()));
    }
}