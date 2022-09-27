class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean bool=true;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        int f=map.get(s.charAt(0));
        for(Integer i:map.values()) if(f!=i) return !bool;
        return bool;
    }
}