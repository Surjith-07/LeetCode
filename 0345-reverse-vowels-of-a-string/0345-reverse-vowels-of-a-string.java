class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1) return s;
        char[] ans=new char[s.length()];
        int p=0,k=0;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                ans[p++]=ch;
                k++;
            }
    }
        if(k==0) return s;
        int l=p-1;
        for(int i=0;i<=l/2;++i)
        {
            char tmp=ans[i];
            ans[i]=ans[p-1-i];
            ans[p-1-i]=tmp;
        }
        p=0;
        char res[]=s.toCharArray();
        for(int i=0;i<res.length;++i){
            if("AEIOUaeiou".indexOf(res[i])!=-1){
                res[i]=ans[p++];
            }
        }
        return new String(res);
 }
}