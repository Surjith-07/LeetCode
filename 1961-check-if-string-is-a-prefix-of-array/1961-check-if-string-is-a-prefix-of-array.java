class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String ss:words){
            if(s.indexOf(ss)!=-1){
                sb.append(ss);
            }
            if(sb.toString().equals(s)) return true;
            if(s.indexOf(ss)==-1) return false;
        }
        return false;
    }
}