class Solution {
    public int concatenatedBinary(int n) {
        long mod=(long)1e9+7;
        int nobits=1;
        long ans=1;
        for(int i=2;i<=n;++i){
            if((i&(i-1))==0)++nobits;
            ans=((ans<<nobits)|i)%mod;
        }
        return (int)ans;
    }
}