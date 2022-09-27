class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(Character ch:s.toCharArray()) map.merge(ch,1,Integer::sum);
        List<Integer> li=new ArrayList<>();
        for(Map.Entry m: map.entrySet()){
            li.add((int)m.getValue());
    }
        int f=li.get(0);
        for(int i=1;i<li.size();++i) if(li.get(i)!=f) return false;
        return true;
    }
}