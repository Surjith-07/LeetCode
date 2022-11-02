class Solution {
    public String kthDistinct(String[] arr, int k) {
     Map<String,Integer> map=new LinkedHashMap<>();
        for(String s:arr) map.put(s,map.getOrDefault(s,0)+1);
        int cnt=1;
        for(String ss:arr){
            if(map.get(ss)==1 && cnt++ == k){
                return ss;
            }
        }
        return "";
    }
}