import java.math.BigInteger;
class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> boss=new Stack<>(); //["5","-2","4","C","D","9","+","+"]
        for(String s:op){
            if(chck(s)){
                Integer n=Integer.parseInt(s);
                boss.push(n);
            }
            else if(!boss.isEmpty()){
            if(s.equals("C")){
                boss.pop();
            }if(s.equals("D")){
                Integer l=boss.pop();
                boss.push(l);
                boss.push(l*2);
            }if(s.equals("+")){
                Integer v1=boss.pop();
                Integer v2=boss.pop();
                boss.push(v2); boss.push(v1); boss.push(v1+v2);
                }
        }   
    }
        int sum=0;
        while(!boss.isEmpty()){ sum+=boss.pop();}
        return sum;
    }
    public static boolean chck(String s){
        try{
            int b=Integer.parseInt(s);
            return true;
        } catch(Exception e){return false;}
    }
}