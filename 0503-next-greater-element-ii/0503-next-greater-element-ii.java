class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len],p=0;
        for(int i=0;i<len;++i){
            int j=i+1,k=0;
            int c=0,l=0;
            while(j<len){
                if(nums[i]<nums[j]){
                    ans[p++]=nums[j];
                    c++;
                    break;
                }
                j++;
            }
         if(c==0){
                while(k<i){
                    if(nums[i]<nums[k]){
                        ans[p++]=nums[k];
                        l++;
                        break;
                    }
                    k++;
                }
            }
            if(l==0 && c==0) ans[p++]=-1;
        }
        return ans;
    }
}