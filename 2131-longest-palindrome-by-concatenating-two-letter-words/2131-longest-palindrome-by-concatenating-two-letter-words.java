class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> dif=new HashMap<>();
        Map<String,Integer> sam=new HashMap<>();
        for(String s:words){
            if(s.charAt(0)!=s.charAt(1)){
                dif.put(s,dif.getOrDefault(s,0)+1);
            } else sam.put(s,sam.getOrDefault(s,0)+1);
        }
        int ans=0;
        for(String s:dif.keySet()){
            String s1=s,s2=new StringBuilder(s1).reverse().toString();
            if(dif.containsKey(s1) && dif.containsKey(s2)){
                ans+=Math.min(dif.get(s1),dif.get(s2))*4;
                dif.put(s1,0);
                dif.put(s2,0);
            }
        }
        int k=0;
        for(String s:sam.keySet()){
            if(sam.get(s)%2==0) ans+=sam.get(s)*2; 
            else{ ans+=(sam.get(s)-1)*2; k++;}
        }
        if(k!=0) ans+=2;
        return ans;
    }
}