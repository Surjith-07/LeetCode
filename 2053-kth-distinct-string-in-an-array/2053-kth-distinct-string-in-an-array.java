class Solution {
    public String kthDistinct(String[] arr, int k) {
     Map<String,Integer> map=new LinkedHashMap<>();
        for(String s:arr) map.put(s,map.getOrDefault(s,0)+1);
        List<String> li=new ArrayList<>();
        for(String ss:map.keySet()){
            if(map.get(ss) == 1) li.add(ss); 
        }
        if(li.size()<k) return "";
        return li.get(k-1);
    }
}