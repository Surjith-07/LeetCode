class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer>li=new ArrayList<>(map.keySet()); 
        Collections.sort(li,(a,b)->map.get(b)-map.get(a));
        int ans[]=new int[k],l=k,p=0;
        while(l-->0){
            ans[p]=li.get(p);
            p++;
        }
        return ans;
    }
}