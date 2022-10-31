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
    public int numComponents(ListNode head, int[] nums) {
        List<Integer> set=new ArrayList<>();
        for(int i:nums) set.add(i);
        int ans=0,cnt=0;
        while(head!=null){
            int k=head.val;
            if(set.contains(k)){
                ++cnt;
                if(cnt==1) ans++;
                }
            else {
                cnt=0;
                }
            head=head.next;
        }
        return ans;
    }
}