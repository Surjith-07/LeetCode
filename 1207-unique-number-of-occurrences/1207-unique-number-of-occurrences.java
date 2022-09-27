class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;++i){   
            map.merge(arr[i],1,Integer::sum);
         }
        Set<Integer> set=new LinkedHashSet<>();
        for(Integer i:map.values()){
            if(set.contains(i)) return false;
            else set.add(i);
        }
        
        return true;
    }
}