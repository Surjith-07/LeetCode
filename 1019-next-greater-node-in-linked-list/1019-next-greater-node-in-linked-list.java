/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li=new ArrayList<>();
        while(head!=null){li.add(head.val); head=head.next;}
        int ans[]=new int[li.size()],cnt=0;
        for(int i=0;i<li.size();i++){
            int max=li.get(i);
            int j=i+1;
            while(j<li.size()){
                if(max < li.get(j)){
                    cnt++;
                    ans[i]=li.get(j);
                    break;
                    }
            j++;
        }
            if(cnt==0) ans[i]=0;
            cnt=0;
      }
        return ans;
    }
}