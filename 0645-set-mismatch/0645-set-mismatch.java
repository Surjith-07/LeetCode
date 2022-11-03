class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> li=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int kk=0;
        for(int i:nums){li.add(i); map.put(i,map.getOrDefault(i,0)+1);}
        for(int i=1;i<=nums.length;++i){
            if(li.indexOf(i)==-1){
                kk=i;
                break;
            }
        }
        int k=0;
        for(Integer kkk:map.keySet()){
            if(map.get(kkk)>1){ k=kkk; break;}
        }
        return new int[]{k,kk};
    }
}