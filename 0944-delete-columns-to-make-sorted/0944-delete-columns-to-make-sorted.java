class Solution {
    public int minDeletionSize(String[] strs) {
        int r=strs[0].length(),c=strs.length;
        char[][] ch=new char[c][r];
        int i=0;
        for(String s:strs){
            int j=0;
            for(char l:s.toCharArray()){
                ch[i][j]=l; j++;
            }
            ++i;
        }
        int cnt=0,ans=0;
        for(int k=0;k<r;++k){
            char cc=ch[0][k];
            for(int j=1;j<c;++j){
                if(cc<=ch[j][k]) cc=ch[j][k];
                else {cnt++; break;}
            }

        }
        return cnt;
    }
}