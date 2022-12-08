/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> sb1=new ArrayList<>(),sb2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return false;
        add(root1,sb1);
        add(root2,sb2);
        
        return sb1.equals(sb2);
    }
    public void add(TreeNode root,List<Integer> sb){
        if(root==null) return;
        if(root.left==null && root.right==null) sb.add(root.val);
        add(root.left,sb);
        add(root.right,sb);
    }
}