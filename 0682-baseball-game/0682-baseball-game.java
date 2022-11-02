import java.math.BigInteger;
class Solution {
    public int calPoints(String[] op) {
        Stack<BigInteger> boss=new Stack<>(); //["5","-2","4","C","D","9","+","+"]
        for(String s:op){
            if(chck(s)){
                BigInteger n=new BigInteger(s);
                boss.push(n);
            }
            else if(!boss.isEmpty()){
            if(s.equals("C")){
                boss.pop();
            }if(s.equals("D")){
                BigInteger l=boss.pop();
                boss.push(l);
                boss.push(l.multiply(new BigInteger(2+"")));
            }if(s.equals("+")){
                BigInteger v1=boss.pop();
                BigInteger v2=boss.pop();
                boss.push(v2); boss.push(v1); boss.push(v1.add(v2));
                }
        }   
    }
        BigInteger sum=new BigInteger(0+"");
        while(!boss.isEmpty()){ sum=sum.add(boss.pop());}
        return sum.intValue();
    }
    public static boolean chck(String s){
        try{
            BigInteger b=new BigInteger(s);
            return true;
        } catch(Exception e){return false;}
    }
}