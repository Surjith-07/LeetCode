class Solution {
    public boolean checkDistances(String s, int[] dis) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int val=map.get(ch);
                if(dis[ch-'a']!=(i-val-1))return false;
            }
              map.put(ch,i);
        }
        return true;
    }
}