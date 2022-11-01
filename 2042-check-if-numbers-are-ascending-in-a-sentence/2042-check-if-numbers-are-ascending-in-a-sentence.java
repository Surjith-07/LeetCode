class Solution {
    public boolean areNumbersAscending(String s) {
       int max=Integer.MIN_VALUE;
        String ans[]= s.split(" ");
        for(int i=0;i<ans.length;++i){
            if(getru(ans[i])){
                int k=Integer.parseInt(ans[i]);
            if(max<k){
                max=k;
            }else return false;
            }
        }
        return true;
    }
    static boolean getru(String k){
        try{
            Integer.parseInt(k); return true;
        }catch(Exception e){return false;}
    }
}