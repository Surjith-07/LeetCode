class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        int min=Integer.MAX_VALUE,len1=l1.length,len2=l2.length;
        for(int i=0;i<len1;++i){
            for(int j=0;j<len2;++j){
                if(l1[i].equals(l2[j])){
                    if(min>(i+j)){
                        min=(i+j);
                    }
                }
            }
        }
         String ans[]=new String[len1+len2];
            int q=0;
        for(int i=0;i<len1;++i){
            for(int j=0;j<len2;++j){
                if(l1[i].equals(l2[j])){
                    if(min==i+j){
                        ans[q++]=l1[i];
                    }
                }
            }
        }
       
    return Arrays.copyOfRange(ans,0,q);
    }
}