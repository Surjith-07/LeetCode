class Solution {
    public int minDeletionSize(String[] strs) {
        int r=strs.length,c=strs[0].length();
        char[][] ch=new char[r][c];
        int i=0;
        for(String s:strs){
            int j=0;
            for(char l:s.toCharArray()){
                ch[i][j]=l; j++;
            }
            ++i;
        }
        int cnt=0,ans=0;
        for(int k=0;k<c;++k){
            char cc=ch[0][k];
            for(int j=1;j<r;++j){
                if(cc<=ch[j][k]) cc=ch[j][k];
                else {cnt++; break;}
            }

        }
        return cnt;
    }
}