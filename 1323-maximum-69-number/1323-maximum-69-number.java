class Solution {
    public int maximum69Number (int num) {
        int max=Integer.MIN_VALUE;
        char []ch=(num+"").toCharArray();
        for(int i=0;i<ch.length;++i){
            char chh[]=ch.clone();
            max=Math.max(swap(chh,i),max);
        }
        return max>Integer.parseInt(String.valueOf(num+""))?max:Integer.parseInt(String.valueOf(num+""));
    }
    static int swap(char ch[],int idx){
        if(ch[idx]=='6') ch[idx]='9';
        else if(ch[idx]=='9') ch[idx]='6';
        return Integer.parseInt(String.valueOf(ch));
    }
}