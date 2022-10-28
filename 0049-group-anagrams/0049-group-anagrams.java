class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> li=new ArrayList<>();
        String ans[]=new String[str.length];
        int p=0;
        for(int i=0;i<str.length;++i){
            char ch[]=str[i].toCharArray();  Arrays.sort(ch);
            ans[p++]=new String(ch);
        }
        for(int i=0;i<ans.length;++i){
             List<String> list=new ArrayList<>();
            if(ans[i]!="-1"){
            for(int j=i+1;j<ans.length;++j){
                if(ans[i].equals(ans[j]) && ans[j]!="-1"){
                    list.add(str[j]);
                    ans[j]="-1";
                }
            }
            list.add(str[i]);
            li.add(new ArrayList<>(list));
            list.clear();
    }
}
        return li;
    }
}