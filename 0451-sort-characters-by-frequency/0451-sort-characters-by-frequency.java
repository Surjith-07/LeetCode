class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        
        for(Character ch:map.keySet()) pq.offer(ch);
        String ans="";
        while(!pq.isEmpty()){ char c=pq.poll(); ans+=(c+"").repeat(map.get(c));}
        return ans;
    }
}