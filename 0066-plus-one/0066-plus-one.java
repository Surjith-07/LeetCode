import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] di) {
        String s="";
        for(int i:di) s+=i;
        int arr[]=new int[di.length+1],p=0;
        String k=new BigInteger(s).add(new BigInteger(String.valueOf(1))).toString();
        for(char ch:k.toCharArray()) arr[p++]=ch-48;
        
        return Arrays.copyOfRange(arr,0,p);
    }
}