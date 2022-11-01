class Solution {
    public boolean areNumbersAscending(String s) {
       int max=Integer.MIN_VALUE;
        String ans[]= s.split(" ");
        for(int i=0;i<ans.length;++i){
            if(getru(ans[i])){
            if(max<Integer.parseInt(ans[i])){
                max=Integer.parseInt(ans[i]);
            }else return false;
            }
        }
        // System.out.print(Arrays.toString(Arrays.copyOfRange(arr,0,p)));
        return true;
    }
    static boolean getru(String k){
        try{
            Integer.parseInt(k); return true;
        }catch(Exception e){return false;}
    }
}