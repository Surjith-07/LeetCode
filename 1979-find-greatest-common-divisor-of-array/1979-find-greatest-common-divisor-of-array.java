class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        if(max==min) return min;
        int gcd=0;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0) gcd=i;
        }
        return gcd;
    } 
}