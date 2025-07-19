/*
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
    public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList <Integer> output = new ArrayList <>();
            Stack <TreeNode> Stack = new Stack();
            TreeNode node = root;
            while(node!=null || !Stack.isEmpty())
            {
                while(node!=null){
                    Stack.add(node);
                    node = node.left;
                }
                node = Stack.pop();
                output.add(node.val);
                node=node.right;
            }
            return output;
    }
}
/* out put :Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2] */
