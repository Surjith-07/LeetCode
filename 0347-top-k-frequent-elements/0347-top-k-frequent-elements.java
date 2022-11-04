class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k],p=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Integer key:map.keySet()) pq.add(key);
        while(k-->0) ans[p++]=pq.poll();
        return ans;
    }
}