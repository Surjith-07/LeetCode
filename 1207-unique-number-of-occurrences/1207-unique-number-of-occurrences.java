class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;++i){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(Integer i:map.values()) li.add(i);
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            for(int j=i+1;j<li.size();++j){
                if(li.get(i).equals(li.get(j))) return false;
            }
        }
        return true;
    }
}