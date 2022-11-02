class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        int min=Integer.MAX_VALUE;
        int arr[]=new int[l1.length+l2.length],p=0;
        for(int i=0;i<l1.length;++i){
            for(int j=0;j<l2.length;++j){
                if(l1[i].equals(l2[j])){
                    if(min>(i+j)){
                        min=(i+j);
                    }
                }
            }
        }
         String ans[]=new String[arr.length];
        int q=0;
        for(int i=0;i<l1.length;++i){
            for(int j=0;j<l2.length;++j){
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