class Solution {
    public int[] twoSum(int[] nums, int tar) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;++i){
            if(map.containsKey(tar-nums[i])){
                return new int[]{map.get(tar-nums[i]) + 1,i + 1};
            }
            else map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}