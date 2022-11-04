class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new TreeMap<>();
        for(String s:words) map.put(s,map.getOrDefault(s,0)+1);
        List<String> ans=new ArrayList<>(map.keySet());
        Collections.sort(ans,(a,b)->map.get(b)-map.get(a));
        return ans.subList(0,k);
    }
}