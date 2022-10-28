class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        int fr2[]=new int[26];
        for(char ch:p.toCharArray()) fr2[ch - 97]++;
        int l1=s.length(),l2=p.length();
        for(int i=0;i<=l1-l2;++i){
         int fr1[]=new int[26];
            boolean b=true;
            String ans=s.substring(i,i+l2);
            for(int k=0;k<ans.length();++k) fr1[ans.charAt(k) - 97]++;
            for(int o=0;o<26;++o) {if(fr1[o]!=fr2[o]) {b=!b; break;}}
            if(b)li.add(i);
        }
        return li;
    }
}