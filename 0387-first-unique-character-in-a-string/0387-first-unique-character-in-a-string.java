class Solution {
    public int firstUniqChar(String s) {
        Map<String,Integer> map=new HashMap<>();
        for(String ch:s.split("")) map.put(ch,map.getOrDefault(ch,0)+1);
        List<String> li=new ArrayList<>();
        for(String ss:s.split("")){
            li.add((ss).repeat(map.get(ss)));
        }
        for(String ch:li){
            if(map.get(ch)!=null && map.get(ch)==1){
                if(li.indexOf(ch)!=-1){
                    return li.indexOf(ch);
                }
            }
        }
        return -1;
    }
}