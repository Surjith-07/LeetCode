class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;++i){   
            map.merge(arr[i],1,Integer::sum);
         }
        return map.size()==new LinkedHashSet<>(map.values()).size();
    }
}