class Solution {
    public boolean digitCount(String num) {
        int frq[]=new int[10];
        for(char ch:num.toCharArray()) frq[ch-'0']++;
        for(int i=0;i<num.length();++i){
            //if(!((n>=0 && (num.charAt(i)-48)<num.length())) return false;
                if(frq[i]!=num.charAt(i)-48) return false;
            }
        return true;
    }
}