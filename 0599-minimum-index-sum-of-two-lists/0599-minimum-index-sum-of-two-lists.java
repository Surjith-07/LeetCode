class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        int min=Integer.MAX_VALUE,len1=l1.length,len2=l2.length;
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<len1;++i){
            map.put(l1[i],i);
        }
        List<String> li=new ArrayList<>();
        for(int i=0;i<len2;++i){
            if(map.containsKey(l2[i])){
                Integer k=map.get(l2[i]);
                if(k!=null && k+i<min){
                    min = k+i;
                }
            }
        }
         for(int i=0;i<len2;++i){
            if(map.containsKey(l2[i])){
                Integer k=map.get(l2[i]);
                if(k!=null && k+i==min){
                    li.add(l2[i]);
                }
            }
        }
        
        return li.toArray(new String[li.size()]);
    }
}