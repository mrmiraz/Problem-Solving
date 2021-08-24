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
// Solve with dfs (LinkedList)
class Solution {
    LinkedList<Integer>list = new LinkedList<>();
     public int kthSmallest(TreeNode root, int k) {
         inOrder(root);
         return list.get(k-1);
    }
     public void inOrder(TreeNode root){
         if(root == null) return;
         inOrder(root.left);
         list.add(root.val);
         inOrder(root.right);
     }
}

// solution with constant memory

class Solution {
    int count = 0;
    int k;
    int number;
     public int kthSmallest(TreeNode root, int k) {
         this.k = k;
         number = root.val;
         inOrder(root);
         return number;
    }
     public void inOrder(TreeNode root){
         if(root == null) return;
         inOrder(root.left);
         count++;
         if(count == k){
             number = root.val;
             return;
         }
         inOrder(root.right);
     }
}