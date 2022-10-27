import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
        String s="";
        for(int i:num){
            s+=i;
        }
        String ss=new BigInteger(s).add(new BigInteger(k+"")).toString();
         for(char ch:ss.toCharArray()) li.add(ch-48);
        return li;
    }
}