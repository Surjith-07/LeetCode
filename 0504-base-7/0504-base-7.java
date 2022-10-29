class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String s="";
        boolean b=true;
        if(num<0){num=num*-1; b=!b;}
        while(num!=0){
            s=num%7+s;
            num/=7;
        }
        return b?s:-1*Integer.parseInt(s)+"";
    }
}